package cn.lixinjiang.memorandum.eg3;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        // 发起人
        Originator ori = new Originator();
        // 备忘录管理员
        Caretaker caretaker = new Caretaker();

        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("===初始状态化===\n" + ori);

        // 创建一个备忘录
        caretaker.setMemento(ori.createMemento());
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");

        System.out.println("\n===修改后状态===\n" + ori);

        // 恢复一个备忘录
        ori.restoreMemento(caretaker.getMemento());
        System.out.println("\n===恢复后状态===\n" + ori);
    }
}
