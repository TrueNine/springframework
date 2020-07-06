package cn.yzdz.proxy;

/**
 * 代理类
 *
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
public class ProxyClient {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new ProxyRole(new RealRole("张三"));
        proxyInterface.proxyFunction();
    }
}

/**
 * 代理接口
 */
interface ProxyInterface {
    /**
     * 真实角色和代理角色都需要实现的方法
     */
    void proxyFunction();
}

/**
 * 代理角色,负责增强真实角色
 */
class ProxyRole implements ProxyInterface {

    private ProxyInterface realRole;

    public ProxyRole(ProxyInterface realRole) {
        this.realRole = realRole;
    }

    /**
     * 真实角色和代理角色都需要实现的方法
     */
    public void proxyFunction() {
        // 调用真实角色
        this.realRole.proxyFunction();
        // 对真实角色进行增强
        this.plus();
    }

    public void plus() {
        System.out.println("ProxyRole.plus");
        System.out.println("对" + this.realRole + "进行了增强");
    }
}

/**
 * 真实角色,纯粹地实现自身功能
 */
class RealRole implements ProxyInterface {

    private String name;

    public RealRole(String name) {
        this.name = name;
    }

    /**
     * 真实角色和代理角色都需要实现的方法
     */
    public void proxyFunction() {
        System.out.println("真实角色" + this.name + "纯粹地在实现功能");
    }

    @Override
    public String toString() {
        return "RealRole{" +
                "name='" + name + '\'' +
                '}';
    }
}