package cn.TrueNine.pojo;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/28
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
