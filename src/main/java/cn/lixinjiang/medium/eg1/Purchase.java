package cn.lixinjiang.medium.eg1;

/**
 * 采购管理
 *
 * @Author lxj
 */
public class Purchase {
    public void byIBMComputer(int num) {
        Stock stock = new Stock();
        Sale sale = new Sale();
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + num + "台");
            stock.increase(num);
        } else {
            int buyNumber = num / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
            stock.increase(buyNumber);
        }
    }

    public void refuseByIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
