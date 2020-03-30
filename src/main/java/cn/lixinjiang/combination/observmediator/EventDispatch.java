package cn.lixinjiang.combination.observmediator;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * 观察者
 *
 * @Author lxj
 */
public class EventDispatch implements Observer {

    /**
     * 单例模式
     */
    private final static EventDispatch DISPATCH = new EventDispatch();

    /**
     * 事件消费者
     */
    private Vector<EventCustomer> customers = new Vector<>();

    private EventDispatch() {

    }

    public static EventDispatch getDispatch() {
        return DISPATCH;
    }

    /**
     * 事件触发，很重要
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        Product product = (Product) arg;
        ProductEvent event = (ProductEvent) o;
        for (EventCustomer e : customers) {
            for (EventCustomType t : e.getCustomTypes()) {
                if (t.getValue() == event.getType().getValue()) {
                    e.exec(event);
                }
            }
        }
    }

    /**
     * 注册很重要
     *
     * @param customer
     */
    public void registerCustomer(EventCustomer customer) {
        customers.add(customer);
    }
}
