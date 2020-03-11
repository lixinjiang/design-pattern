package cn.lixinjiang.visitor.eg2;

import java.util.Random;

/**
 * @Author lxj
 */
public class ObjectStructure {
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
