package cn.lixinjiang.singlepattern.adapter;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Target target1 = new ConcreteTarget();
        target1.request();

        Target target2 = new Adapter();
        target2.request();
    }
}
