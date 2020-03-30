package cn.lixinjiang.singlepattern.observer.eg3;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.haveBreakfast();
    }
}
