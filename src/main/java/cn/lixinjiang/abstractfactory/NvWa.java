package cn.lixinjiang.abstractfactory;

/**
 * @Author lxj
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();

        Human maleBlackHuman = maleFactory.createBlackHuman();
        Human femaleBlackHuman = femaleFactory.createBlackHuman();
        System.out.println("产生第一个黑色女性-----");
        femaleBlackHuman.getColor();
        femaleBlackHuman.getSex();
        femaleBlackHuman.talk();
        System.out.println("产生第一个黑色男性-----");
        maleBlackHuman.getSex();
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
    }
}
