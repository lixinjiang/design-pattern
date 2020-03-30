package cn.lixinjiang.singlepattern.flyweight.selection2;

/**
 * @Author lxj
 */
public class ConcreateFlyweight2 extends Flyweight{

    public ConcreateFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        // 业务操作
    }
}
