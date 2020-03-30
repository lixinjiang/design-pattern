package cn.lixinjiang.singlepattern.bridge.selection2;

/**
 * @Author lxj
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚取。。。");
    }
}
