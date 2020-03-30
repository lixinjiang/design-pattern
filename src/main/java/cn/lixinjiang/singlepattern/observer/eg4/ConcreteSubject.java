package cn.lixinjiang.singlepattern.observer.eg4;

/**
 * @Author lxj
 */
public class ConcreteSubject extends Subject{
    public void doSomething() {
        System.out.println("发送消息");
        super.notifyObservers();
    }
}
