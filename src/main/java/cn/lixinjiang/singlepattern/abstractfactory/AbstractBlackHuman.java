package cn.lixinjiang.singlepattern.abstractfactory;

/**
 * @Author lxj
 */
public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种皮肤颜色是黑色");
    }

    public void talk() {
        System.out.println("黑人会说话，一般人听不懂");
    }
}
