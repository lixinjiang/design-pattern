package cn.lixinjiang.combination.observmediator;

/**
 * @Author lxj
 */
public class Product implements Cloneable {
    private String name;
    /**
     * 是否可用属性变更
     */
    private boolean canChanged = false;

    public Product(ProductManager manager, String name) {
        if (manager.isCreteProduct()) {
            canChanged = true;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Product clone() {
        Product product = null;
        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
