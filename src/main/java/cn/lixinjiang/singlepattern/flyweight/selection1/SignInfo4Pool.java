package cn.lixinjiang.singlepattern.flyweight.selection1;

/**
 * @Author lxj
 */
public class SignInfo4Pool extends SignInfo{
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
