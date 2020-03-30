package cn.lixinjiang.singlepattern.observer.eg2;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
