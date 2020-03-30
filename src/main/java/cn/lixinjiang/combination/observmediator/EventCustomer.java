package cn.lixinjiang.combination.observmediator;

import java.util.Vector;

/**
 * @Author lxj
 */
public abstract class EventCustomer {
    /**
     * 容纳每个消费者能够处理的级别
     */
    private Vector<EventCustomType> customTypes = new Vector<>();

    public EventCustomer(EventCustomType type) {
        addCustomType(type);
    }

    public void addCustomType(EventCustomType type) {
        customTypes.add(type);
    }

    public Vector<EventCustomType> getCustomTypes() {
        return customTypes;
    }

    public abstract void exec(ProductEvent event);
}
