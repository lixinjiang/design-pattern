package cn.lixinjiang.singlepattern.medium.eg1;

import java.util.Random;

/**
 * 销售系统
 *
 * @Author lxj
 */
public class Sale {
    public void sellIBMComputer(int num) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < num) {
            purchase.byIBMComputer(num);
        }
        System.out.println("销售IBM电脑" + num + "台");
        stock.decrease(num);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑销售情况为：" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

}
