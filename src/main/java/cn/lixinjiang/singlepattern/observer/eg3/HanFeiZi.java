package cn.lixinjiang.singlepattern.observer.eg3;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class HanFeiZi implements Observable, IHanFeiZi {

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了。。");
        this.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了。。。");
        this.notifyObservers("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer o : observers) {
            o.update(context);
        }
    }
}
