package cn.lixinjiang.singlepattern.command.selection1;

/**
 * @Author lxj
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}