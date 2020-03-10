package cn.lixinjiang.proxy;

/**
 * @Author lxj
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实角色");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String pwd) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功");

    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "升了一级");
    }
}
