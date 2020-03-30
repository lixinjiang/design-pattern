package cn.lixinjiang.combination.factorystragety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Card card = initIC();
        System.out.println("==========初始卡信息：==========");
        showCard(card);
        boolean flag = true;
        while (flag) {
            Trade trade = createTrade();
            DeductionFacade.deduct(card, trade);
            //交易成功，打印成功信息
            System.out.println("\n==========交易凭证==========");
            System.out.println(trade.getTradeNo() + "  交易成功");
            System.out.println("本次发生的交易金额为：" + trade.getAmount() / 100.0 + "元");
            showCard(card);
            System.out.println("\n是否需要退出？（Y/N）");
            if (getInput().equalsIgnoreCase("y")) {
                flag = false;
            }
        }
    }

    private static Card initIC() {
        Card card = new Card();
        card.setCardNO("1100010001000");
        card.setFreeMoney(100000);
        card.setSteadyMoney(80000);
        return card;
    }

    private static Trade createTrade() {
        Trade trade = new Trade();
        System.out.println("请输入交易编号：");
        trade.setTradeNo(getInput());
        System.out.println("请输入交易金额：");
        trade.setAmount(Integer.parseInt(getInput()));
        return trade;
    }

    public static String getInput() {
        String str = "";
        try {
            str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void showCard(Card card) {
        System.out.println("IC卡编号：" + card.getCardNO());
        System.out.println("固定类型金额：" + card.getSteadyMoney() / 100.0 + "元");
        System.out.println("自由类型金额：" + card.getFreeMoney() / 100.0 + "元");
    }
}
