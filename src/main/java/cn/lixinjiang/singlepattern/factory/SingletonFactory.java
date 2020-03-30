package cn.lixinjiang.singlepattern.factory;

import java.lang.reflect.Constructor;

/**
 * @Author lxj
 */
public class SingletonFactory {

    private static Singleton singleton = null;

    static {
        try {
            Class c = Class.forName(Singleton.class.getName());
            Constructor constructor = c.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doSomething() {

    }
}
