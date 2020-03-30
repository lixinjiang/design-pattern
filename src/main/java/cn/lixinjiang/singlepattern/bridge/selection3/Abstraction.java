package cn.lixinjiang.singlepattern.bridge.selection3;

/**
 * @Author lxj
 */
public class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        this.implementor.doSomething();
    }

    public Implementor getImpl() {
        return implementor;
    }
}
