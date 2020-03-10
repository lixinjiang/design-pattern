package cn.lixinjiang.chain.eg1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(new Womem(random.nextInt(4), "我要出去逛街"));
        }

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {
                son.HandleMessage(women);
            } else {
                //none
            }
        }
    }
}
