package cn.lixinjiang.observer.eg5;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author lxj
 */
public class LiSi implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报。。。");
        this.reprotToQinShiHuang(arg.toString());
    }

    public void reprotToQinShiHuang(String context) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + context);
    }
}
