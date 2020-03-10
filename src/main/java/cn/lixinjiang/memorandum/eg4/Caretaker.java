package cn.lixinjiang.memorandum.eg4;

import java.util.HashMap;

import cn.lixinjiang.memorandum.eg3.Memento;

/**
 * @Author lxj
 */
public class Caretaker {
    private HashMap<String, Memento> memMap = new HashMap<>();

    public Memento getMemento(String idx) {
        return memMap.get(idx);
    }

    public void setMemento(String idx, Memento memento) {
        this.memMap.put(idx, memento);
    }
}
