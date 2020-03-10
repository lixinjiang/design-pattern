package cn.lixinjiang.observer.eg1;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        Spy spy = new Spy(hanFeiZi, liSi, "breakfast");
        spy.start();

        Spy spyFun = new Spy(hanFeiZi, liSi, "fun");
        spyFun.start();

        Thread.sleep(1000);
        hanFeiZi.haveBreakfast();
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
