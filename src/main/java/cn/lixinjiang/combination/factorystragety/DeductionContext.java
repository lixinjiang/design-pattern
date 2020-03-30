package cn.lixinjiang.combination.factorystragety;

/**
 * 策略封装类，典型策略模式
 * 缺陷：将所有的策略都暴露出去了，风险太大
 *
 * @Author lxj
 */
public class DeductionContext {
    private IDeduction deduction = null;

    /**
     * 构造函数传递策略
     *
     * @param _deduction
     */
    public DeductionContext(IDeduction _deduction) {
        this.deduction = _deduction;
    }

    public boolean exec(Card card, Trade trade) {
        return this.deduction.exec(card, trade);
    }
}
