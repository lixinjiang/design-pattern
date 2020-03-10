package cn.lixinjiang.medium.eg2;

import cn.lixinjiang.medium.eg2.Purchase;
import cn.lixinjiang.medium.eg2.Sale;
import cn.lixinjiang.medium.eg2.Stock;

/**
 * 抽象中介,实现中介者的抽象定义，定义一个抽象方法execute
 *
 * @Author lxj
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    /**
     * 中介者重要的方法叫做事件方法，处理多个对象之间的关系
     */
    public abstract void execute(String str, Object... objects);
}
