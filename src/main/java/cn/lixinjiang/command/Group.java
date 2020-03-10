package cn.lixinjiang.command;

/**
 * @Author lxj
 */
public abstract class Group {
    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void plan();

    public void rollBack() {
        // 根据日志进行回滚

    }
}
