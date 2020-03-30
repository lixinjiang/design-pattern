package cn.lixinjiang.singlepattern.memorandum.eg3;

/**
 * @Author lxj
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
