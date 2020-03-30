package cn.lixinjiang.singlepattern.medium.eg2;

/**
 * @Author lxj
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void byIBMComputer(int num) {
        super.mediator.execute("purchase.buy", num);
    }

    public void refuseByIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
