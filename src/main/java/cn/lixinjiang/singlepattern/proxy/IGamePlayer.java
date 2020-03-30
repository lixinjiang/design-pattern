package cn.lixinjiang.singlepattern.proxy;

/**
 * @Author lxj
 */
public interface IGamePlayer {
    public void login(String user,String pwd);

    public void killBoss();

    public void upgrade();
}
