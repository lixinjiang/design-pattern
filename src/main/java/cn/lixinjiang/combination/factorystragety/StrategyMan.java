package cn.lixinjiang.combination.factorystragety;

/**
 * 策略枚举
 * 策略管理类
 *
 * @Author lxj
 */
public enum StrategyMan {
    /**
     * 固定策略
     */
    SteadyDeduction("cn.lixinjiang.combination.factorystragety.SteadyDeduction"),
    /**
     * 自由策略
     */
    FreeDeduction("cn.lixinjiang.combination.factorystragety.FreeDeduction");

    String value = "";

    private StrategyMan(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
