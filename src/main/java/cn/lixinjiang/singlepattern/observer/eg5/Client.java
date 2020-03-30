package cn.lixinjiang.singlepattern.observer.eg5;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();
        hanFeiZi.addObserver(liSi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
