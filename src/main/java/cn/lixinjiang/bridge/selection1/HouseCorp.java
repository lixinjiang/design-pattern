package cn.lixinjiang.bridge.selection1;

/**
 * @Author lxj
 */
public class HouseCorp extends Corp{

    @Override
    protected void produce() {
        System.out.println("泛地产公司盖楼房。。。");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司卖楼房。。。");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了。。。");
    }
}
