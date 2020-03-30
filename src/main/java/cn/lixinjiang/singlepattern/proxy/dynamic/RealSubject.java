package cn.lixinjiang.singlepattern.proxy.dynamic;

/**
 * @Author lxj
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething(String str) {
        System.out.println("do something!-------> " + str);
    }
}
