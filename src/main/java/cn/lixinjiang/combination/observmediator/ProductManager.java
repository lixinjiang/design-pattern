package cn.lixinjiang.combination.observmediator;

/**
 * @Author lxj
 */
public class ProductManager {
    /**
     * 是否可用创建产品
     */
    private boolean isPermittedCreate = false;

    public Product createProduct(String name) {
        isPermittedCreate = true;
        Product p = new Product(this, name);
        // 产生一个创建事件
        new ProductEvent(p, ProductEventType.NEW_PRODUCT);
        return p;
    }

    public void abandonProduct(Product product) {
        // 销毁一个产品
        new ProductEvent(product, ProductEventType.DEL_PRODUCT);
        product = null;
    }

    public void editProduct(Product p, String name) {
        p.setName(name);
        // 产生修改事件
        new ProductEvent(p, ProductEventType.EDIT_PRODUCT);
    }

    public boolean isCreteProduct() {
        return isPermittedCreate;
    }

    public Product clone(Product product) {
        new ProductEvent(product, ProductEventType.CLONE_PRODUCT);
        return product.clone();
    }
}
