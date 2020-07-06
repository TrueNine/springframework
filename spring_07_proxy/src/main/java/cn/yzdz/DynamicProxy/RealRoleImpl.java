package cn.yzdz.DynamicProxy;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
public class RealRoleImpl implements ProxyInterface {

    public void price() {
        System.out.println("RealRoleImpl.price");
        System.out.println("真实角色方法");
    }
}
