package cn.lixinjiang.bridge.selection3;

/**
 * @Author lxj
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 修正父类的行为
     */
    @Override
    public void request() {
        super.request();
        super.getImpl().doAnything();
    }
}
