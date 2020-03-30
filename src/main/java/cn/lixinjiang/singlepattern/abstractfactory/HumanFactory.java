package cn.lixinjiang.singlepattern.abstractfactory;

/**
 * @Author lxj
 */
public interface HumanFactory {
    public Human createYellowHuman();

    public Human createBlackHuman();

    public Human createWhiteHuman();
}
