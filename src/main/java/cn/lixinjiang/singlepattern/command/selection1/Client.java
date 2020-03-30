package cn.lixinjiang.singlepattern.command.selection1;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver = new ConcretReciver1();

        Command command = new ConcreteCommand1(receiver);

        invoker.setCommand(command);

        invoker.action();
    }
}
