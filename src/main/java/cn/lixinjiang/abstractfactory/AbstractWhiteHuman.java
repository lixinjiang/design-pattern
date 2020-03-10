package cn.lixinjiang.abstractfactory;

/**
 * @Author lxj
 */
public abstract class AbstractWhiteHuman implements Human {

    public void getColor() {
        System.out.println("白色人种皮肤颜色是白的");
    }

    public void talk() {
        System.out.println("白色人种会说话，一般是单字节");
    }
}
