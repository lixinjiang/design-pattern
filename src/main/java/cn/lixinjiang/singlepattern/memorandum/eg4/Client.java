package cn.lixinjiang.singlepattern.memorandum.eg4;

import cn.lixinjiang.singlepattern.memorandum.eg3.Originator;

/**
 * 多备份备忘录
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento("001", originator.createMemento());
        caretaker.setMemento("002", originator.createMemento());
        originator.restoreMemento(caretaker.getMemento("001"));
    }
}
