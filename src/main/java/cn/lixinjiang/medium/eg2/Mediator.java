package cn.lixinjiang.medium.eg2;

/**
 * 具体中介者
 *
 * @Author lxj
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int num) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + num + "台");
            super.stock.increase(num);
        } else {
            int buyNumber = num / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
            stock.increase(buyNumber);
        }
    }

    private void sellComputer(int num) {
        if (super.stock.getStockNumber() < num) {
            super.purchase.byIBMComputer(num);
        }
        System.out.println("销售IBM电脑" + num + "台");
        stock.decrease(num);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseByIBM();
    }
}
