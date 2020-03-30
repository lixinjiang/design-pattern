package cn.lixinjiang.singlepattern.abstractfactory;

/**
 * @Author lxj
 */
public class FemaleFactory implements HumanFactory {

    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
