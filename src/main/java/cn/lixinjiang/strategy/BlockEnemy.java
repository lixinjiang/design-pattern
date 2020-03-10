package cn.lixinjiang.strategy;

/**
 * @Author lxj
 */
public class BlockEnemy implements IStrategy{

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
