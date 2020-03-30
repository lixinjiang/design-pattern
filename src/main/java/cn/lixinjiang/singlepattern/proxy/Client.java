package cn.lixinjiang.singlepattern.proxy;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        proxy.login("zhangsan","pwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
