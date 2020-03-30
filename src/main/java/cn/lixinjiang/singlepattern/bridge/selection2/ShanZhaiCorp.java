package cn.lixinjiang.singlepattern.bridge.selection2;

/**
 * @Author lxj
 */
public class ShanZhaiCorp extends Corp{

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱了。。");
    }
}
