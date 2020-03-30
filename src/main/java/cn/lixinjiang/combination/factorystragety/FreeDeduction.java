package cn.lixinjiang.combination.factorystragety;

/**
 * 自由扣款策略
 *
 * @Author lxj
 */
public class FreeDeduction implements IDeduction {

    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
