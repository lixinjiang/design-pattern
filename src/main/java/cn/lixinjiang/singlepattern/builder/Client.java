package cn.lixinjiang.singlepattern.builder;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        benzBuilder.getCarModel().run();
    }
}
