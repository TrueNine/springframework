package cn.yzdz.DynamicProxy;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        RealRole realRole = new RealRole();

        // 动态构建代理角色
        // 通过调用程序处理角色,来处理我们要调用的接口实现类
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(realRole);
        ProxyInterface p = (ProxyInterface) proxyInvocationHandler.getProxy();
        p.price();
    }
}