package cn.lixinjiang.singlepattern.adapter;

/**
 * @Author lxj
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.doSomething();
    }
}
