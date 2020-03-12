package cn.lixinjiang.flyweight.selection2;

import java.util.HashMap;

/**
 * @Author lxj
 */
public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            flyweight = new ConcreateFlyweight1(extrinsic);
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
