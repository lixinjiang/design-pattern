package cn.lixinjiang.proxy.example;

/**
 * @Author lxj
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething() {
        System.out.println("111");
    }
}
