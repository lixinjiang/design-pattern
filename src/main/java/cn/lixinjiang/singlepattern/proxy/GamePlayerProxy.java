package cn.lixinjiang.singlepattern.proxy;

/**
 * @Author lxj
 */
public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String pwd) {
        this.gamePlayer.login(user,pwd);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
