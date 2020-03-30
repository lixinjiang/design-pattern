package cn.lixinjiang.singlepattern.composite.eg2;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public abstract class Component {
    public void doSomething() {

    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildren();
}
