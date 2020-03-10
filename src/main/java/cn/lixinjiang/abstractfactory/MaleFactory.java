package cn.lixinjiang.abstractfactory;

/**
 * @Author lxj
 */
public class MaleFactory implements HumanFactory {

    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
