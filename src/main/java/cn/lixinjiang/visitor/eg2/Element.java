package cn.lixinjiang.visitor.eg2;

/**
 * @Author lxj
 */
public abstract class Element {
    public abstract void doSomething();

    public abstract void accept(IVisitor visitor);
}
