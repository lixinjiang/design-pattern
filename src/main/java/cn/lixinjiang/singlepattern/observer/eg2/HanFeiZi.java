package cn.lixinjiang.singlepattern.observer.eg2;

/**
 * @Author lxj
 */
public class HanFeiZi implements IHanFeiZi{

    private ILiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭。。。");
        this.liSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了。。。");
        this.liSi.update("韩非子在娱乐");
    }
}
