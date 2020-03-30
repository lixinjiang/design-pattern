package cn.lixinjiang.combination.factorystragety;

/**
 * 固定扣款策略
 *
 * @Author lxj
 */
public class SteadyDeduction implements IDeduction {

    @Override
    public boolean exec(Card card, Trade trade) {
        // 固定金额和自由交易金额各扣除50%
        int halfMoney = (int) Math.rint(trade.getAmount() / 2.0);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true;
    }
}
