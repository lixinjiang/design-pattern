package cn.lixinjiang.abstractfactory;

/**
 * @Author lxj
 */
public interface HumanFactory {
    public Human createYellowHuman();

    public Human createBlackHuman();

    public Human createWhiteHuman();
}
