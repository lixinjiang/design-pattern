package cn.lixinjiang.singlepattern.command.selection2;

/**
 * @Author lxj
 */
public interface Command {
    void execute();

    void undo();
}
