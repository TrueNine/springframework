import cn.yzdz.DynamicProxy.ProxyInterface;
import cn.yzdz.DynamicProxy.RealRole;
import cn.yzdz.DynamicProxy.test.DynamicProxyUtilsClass;
import org.junit.Test;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
public class Ttt {

    @Test
    public void test() {
        // p 对象实现类接口 ProxyInterface,为代理对象
        RealRole p = new RealRole();

        // 使用代理工具类,指定返回泛型为代理接口,并传入真实角色
        DynamicProxyUtilsClass<ProxyInterface> d = new DynamicProxyUtilsClass<>(p);

        // 从代理工具类获取对象
        ProxyInterface proxy = d.getDynamicProxyObject(d);

        // 执行代理后的方法
        proxy.price();
    }
}