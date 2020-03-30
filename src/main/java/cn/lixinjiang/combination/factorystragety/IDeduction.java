package cn.lixinjiang.combination.factorystragety;

/**
 * 扣款策略接口
 *
 * @Author lxj
 */
public interface IDeduction {
    /**
     * 扣款，提供交易信息和卡信息，进行扣款，并返回是否成功
     *
     * @param card
     * @param trade
     *
     * @return
     */
    public boolean exec(Card card, Trade trade);
}
