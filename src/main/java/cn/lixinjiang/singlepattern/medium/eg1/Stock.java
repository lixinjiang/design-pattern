package cn.lixinjiang.singlepattern.medium.eg1;

/**
 * 库存管理
 *
 * @Author lxj
 */
public class Stock {
    private static int COMPUTER_NUMBER = 100;

    public void increase(int num) {
        COMPUTER_NUMBER += num;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public void decrease(int num) {
        COMPUTER_NUMBER -= num;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
        // 要求折价销售
        sale.offSale();
        purchase.refuseByIBM();
    }
}
