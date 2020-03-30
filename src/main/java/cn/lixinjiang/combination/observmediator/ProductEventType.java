package cn.lixinjiang.combination.observmediator;

/**
 * @Author lxj
 */
public enum ProductEventType {
    //新建一个产品
    NEW_PRODUCT(1),
    DEL_PRODUCT(2),
    EDIT_PRODUCT(3),
    CLONE_PRODUCT(4);

    private int value = 0;

    ProductEventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
