package cn.TrueNine.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User {
    /**
     * 此注解同样可以作用于set 方法
     */
    @Value("测试值的注入")
    public String name;

}