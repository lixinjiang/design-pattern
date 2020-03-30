package cn.lixinjiang.combination.observmediator;

/**
 * @Author lxj
 */
public class Beggar extends EventCustomer {

    public Beggar() {
        super(EventCustomType.DEL);
    }

    @Override
    public void exec(ProductEvent event) {
        Product p = event.getSource();
        ProductEventType type = event.getType();
        System.out.println("乞丐处理事件：" + p.getName() + "销毁，事件类型=" + type);

    }
}
