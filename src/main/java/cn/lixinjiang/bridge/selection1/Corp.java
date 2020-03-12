package cn.lixinjiang.bridge;

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
