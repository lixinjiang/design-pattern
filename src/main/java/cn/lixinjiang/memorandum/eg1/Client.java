package cn.lixinjiang.memorandum.eg1;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很棒");
        caretaker.setMemento(boy.createMemento());
        boy.changeState();
        boy.restoreMemento(caretaker.getMemento());

    }
}
