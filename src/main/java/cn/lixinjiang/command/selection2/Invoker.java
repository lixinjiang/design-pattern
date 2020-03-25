package cn.lixinjiang.command.selection2;

/**
 * @Author lxj
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
