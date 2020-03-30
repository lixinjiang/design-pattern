package cn.lixinjiang.singlepattern.command.selection2;

/**
 * @Author lxj
 */
public class RequestCommand {
    Command command;

    public RequestCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }
}
