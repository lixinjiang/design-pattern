package cn.lixinjiang.combination.factorystragety;

/**
 * @Author lxj
 */
public class DeductionFacade {
    /**
     * 对外发布扣款封装
     *
     * @param card
     * @param trade
     *
     * @return
     */
    public static Card deduct(Card card, Trade trade) {
        StrategyMan reg = getDeductionType(trade);
        IDeduction deduction = StrategyFactory.getDeduction(reg);
        DeductionContext context = new DeductionContext(deduction);
        context.exec(card, trade);
        return card;
    }

    /**
     * 业务中，需将这个方法移到Helper类中
     *
     * @param trade
     *
     * @return
     */
    private static StrategyMan getDeductionType(Trade trade) {
        if (trade.getTradeNo().startsWith("abc")) {
            return StrategyMan.FreeDeduction;
        } else {
            return StrategyMan.SteadyDeduction;
        }
    }
}
