package cn.lixinjiang.bridge.selection1;

/**
 * @Author lxj
 */
public abstract class Corp {

    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
