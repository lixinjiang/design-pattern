package cn.lixinjiang.combination.factorystragety;

/**
 * @Author lxj
 */
public class Card {
    /**
     * 卡号
     */
    private String cardNO = "";
    /**
     * 卡内固定交易金额
     */
    private int steadyMoney = 0;
    /**
     * 卡内自由交易金额
     */
    private int freeMoney = 0;

    public String getCardNO() {
        return cardNO;
    }

    public void setCardNO(String cardNO) {
        this.cardNO = cardNO;
    }

    public int getSteadyMoney() {
        return steadyMoney;
    }

    public void setSteadyMoney(int steadyMoney) {
        this.steadyMoney = steadyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }
}
