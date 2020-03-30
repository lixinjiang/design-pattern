package cn.lixinjiang.singlepattern.strategy;

/**
 * @Author lxj
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void open() {
        this.strategy.operate();
    }
}
