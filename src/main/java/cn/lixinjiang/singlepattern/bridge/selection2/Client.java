package cn.lixinjiang.singlepattern.bridge.selection2;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        IPod iPod = new IPod();
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(iPod);
        shanZhaiCorp.makeMoney();
    }
}
