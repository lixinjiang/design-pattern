package cn.lixinjiang.medium.eg2;

import java.util.Random;

/**
 * @Author lxj
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑销售情况为：" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }

    public void sellIBMComputer(int num) {
        super.mediator.execute("sale.sell", num);
        System.out.println("销售IBM电脑" + num + "台");
    }
}
