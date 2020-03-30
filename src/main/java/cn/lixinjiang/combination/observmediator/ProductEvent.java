package cn.lixinjiang.combination.observmediator;

import java.util.Observable;

/**
 * 考虑到事件处理时候该做什么
 *
 * @Author lxj
 */
public class ProductEvent extends Observable {

    /**
     * 事件起源
     */
    private Product source;
    /**
     * 事件类型
     */
    private ProductEventType type;

    /**
     * 传入事件的类型，默认为新建类型
     *
     * @param p
     */
    public ProductEvent(Product p) {
        this(p, ProductEventType.NEW_PRODUCT);
    }

    public ProductEvent(Product p, ProductEventType type) {
        this.source = p;
        this.type = type;
        // 事件触发
        notifyEventDispatch();
    }

    /**
     * 获得事件的始作俑者
     *
     * @return
     */
    public Product getSource() {
        return source;
    }

    /**
     * 获得事件类型
     *
     * @return
     */
    public ProductEventType getType() {
        return this.type;
    }

    /**
     * 通知事件处理中心
     */
    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
