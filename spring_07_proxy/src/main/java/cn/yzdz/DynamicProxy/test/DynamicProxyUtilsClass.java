package cn.yzdz.DynamicProxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 一个创建动态代理对象的工具类
 * 使用 Proxy 和 invocationHandler 实现
 *
 * @author TrueNine
 * @see java.lang.reflect.InvocationHandler 代理对象实现的 InvocationHandler 接口
 * @see java.lang.reflect.Proxy 使用此方法进行动态代理 Proxy
 */
public class DynamicProxyUtilsClass<T> implements InvocationHandler {

    private Object target;
    private final ClassLoader thisClassLoader = this.getClass().getClassLoader();

    /**
     * 带参构造
     *
     * @param realObject 需被代理的对象
     */
    public DynamicProxyUtilsClass(Object realObject) {
        this.target = realObject;
    }

    /**
     * 空参构造器,为了预留给某些特殊情况,比如反射使用空参构造
     *
     * @deprecated 使用此构造器没有任何意义, 请尽量使用带参构造器
     */
    @Deprecated
    public DynamicProxyUtilsClass() {
    }

    /**
     * 获取一个动态代理后的对象,
     * 可以传入一个null,不使用任何代理
     * 默认就会使用当前类,但这没有任何意义
     *
     * @param proxyClass 代理类,需实现 InvocationHandler 接口
     * @return 泛型指定的对象, 内部进行强转
     * @see java.lang.reflect.InvocationHandler proxyClass 必须实现此接口
     */
    @SuppressWarnings("all")
    public T getDynamicProxyObject(InvocationHandler proxyClass) {
        return (T) Proxy.newProxyInstance(
                thisClassLoader,
                this.target.getClass().getInterfaces(),
                null == proxyClass ? this : proxyClass);
    }

    /**
     * 一个无意义的方法,如果 getDynamicProxyObject 方法没有指定代理类,则使用此方法进行代理
     *
     * @param proxy  代理对象
     * @param method 执行方法
     * @param args   方法参数
     * @return 方法执行结果  (method.invoke())
     * @throws Throwable 执行异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[代理] " + method.getName() + "执行了,但没有使用任何代理对象");
        return method.invoke(this.target, args);
    }
}