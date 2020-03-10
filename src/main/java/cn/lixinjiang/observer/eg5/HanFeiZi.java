package cn.lixinjiang.observer.eg5;

import java.util.Observable;

/**
 * @Author lxj
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭啦。。");
        // 通知观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了。。。");
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}
