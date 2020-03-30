package cn.lixinjiang.combination.observmediator;

/**
 * @Author lxj
 */
public class Commoner extends EventCustomer {

    public Commoner() {
        super(EventCustomType.NEW);
    }

    @Override
    public void exec(ProductEvent event) {
        Product p = event.getSource();
        ProductEventType type = event.getType();
        System.out.println("平民处理事件：" + p.getName() + "诞生记，事件类型=" + type);
    }
}
