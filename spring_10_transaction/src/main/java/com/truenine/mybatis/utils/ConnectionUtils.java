package com.truenine.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/2
 */
public class ConnectionUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String connectionConfigSource = "mybatis-config.xml";
            InputStream is = Resources.getResourceAsStream(connectionConfigSource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static SqlSession getSqlSession(boolean isAutoCommit) {
        return sqlSessionFactory.openSession(isAutoCommit);
    }

    public static boolean freeSources(Closeable... closeables) {
        boolean isClose = false;
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                    isClose = true;
                } catch (IOException e) {
                    e.printStackTrace();
                    isClose = false;
                }
            }
        }
        return isClose;
    }
}
