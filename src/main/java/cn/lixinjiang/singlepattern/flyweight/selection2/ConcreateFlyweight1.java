package cn.lixinjiang.singlepattern.flyweight.selection2;

/**
 * @Author lxj
 */
public class ConcreateFlyweight1 extends Flyweight{

    public ConcreateFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        // 业务逻辑
    }
}
