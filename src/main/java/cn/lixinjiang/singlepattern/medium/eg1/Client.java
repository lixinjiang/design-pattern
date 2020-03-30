package cn.lixinjiang.singlepattern.medium.eg1;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        // 采购电脑
        System.out.println("-------采购人员采购电脑-------");
        Purchase purchase = new Purchase();
        purchase.byIBMComputer(100);
        // 销售人员销售电脑
        System.out.println("-------销售人员销售电脑-------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        // 库房管理人员管理库存
        System.out.println("-------库房人员管理库存-------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
