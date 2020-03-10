package cn.lixinjiang.observer.eg1;

/**
 * @Author lxj
 */
public class HanFeiZi implements IHanFeiZi{

    private boolean isHavingBreakfast = false;

    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了。。。");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了。。。");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return this.isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        this.isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return this.isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        this.isHavingFun = havingFun;
    }
}
