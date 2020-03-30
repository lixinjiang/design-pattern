package cn.lixinjiang.combination.observmediator;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        EventDispatch dispatch = EventDispatch.getDispatch();

        dispatch.registerCustomer(new Beggar());

        dispatch.registerCustomer(new Commoner());

        dispatch.registerCustomer(new Nobleman());

        ProductManager f = new ProductManager();
        System.out.println("==========模拟创建产品事件==========");
        System.out.println("创建一个叫做小男孩的原子弹");
        Product p = f.createProduct("小男孩原子弹");

        System.out.println("\n==========模拟修改产线事件==========");
        System.out.println("把小男孩原子弹修改为胖子号原子弹");
        f.editProduct(p, "胖子好原子弹");

        System.out.println("\n==========模拟克隆产品事件==========");
        System.out.println("克隆胖子号原子弹");
        f.clone(p);

        System.out.println("\n==========模拟销毁产品事件==========");
        System.out.println("遗弃胖子号原子弹");
        f.abandonProduct(p);
    }
}
