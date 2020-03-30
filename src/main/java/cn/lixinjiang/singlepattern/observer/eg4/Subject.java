package cn.lixinjiang.singlepattern.observer.eg4;

import java.util.Vector;

/**
 * @Author lxj
 */
public abstract class Subject {
    private Vector<Observer> obsVector = new Vector<>();

    public void addObserver(Observer observer) {
        this.obsVector.add(observer);
    }

    public void delObserver(Observer observer) {
        this.obsVector.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : obsVector) {
            o.update();
        }
    }
}
