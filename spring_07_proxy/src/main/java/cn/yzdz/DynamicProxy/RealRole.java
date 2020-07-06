package cn.yzdz.DynamicProxy;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
public class RealRole implements ProxyInterface {
    /**
     * 业务方法
     */
    public void price() {
        System.out.println("实现业务方法");
    }
}
