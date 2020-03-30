package cn.lixinjiang.singlepattern.observer.eg4;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
