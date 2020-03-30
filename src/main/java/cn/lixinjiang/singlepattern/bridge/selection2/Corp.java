package cn.lixinjiang.singlepattern.bridge.selection2;

/**
 * @Author lxj
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProduct();
        this.product.beSelled();
    }
}
