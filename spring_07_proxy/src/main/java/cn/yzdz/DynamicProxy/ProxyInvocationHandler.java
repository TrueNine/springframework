package cn.yzdz.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private ProxyInterface rea;

    public ProxyInvocationHandler(ProxyInterface realRole) {
        this.rea = realRole;
    }

    @Deprecated
    public ProxyInvocationHandler() {

    }

    /**
     * 生成得到代理对象
     *
     * @return 代理对象???
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                this.rea.getClass().getInterfaces(),
                this);
    }

    /**
     * 处理代理实例,并返回结果
     *
     * @param proxy  代理实例
     * @param method 返回方法
     * @param args   参数列表
     * @return 代理对象
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行接口方法
        return method.invoke(this.rea, args);
    }
}
