package cn.lixinjiang.builder;

/**
 * @Author lxj
 */
public class BMWModel extends CarModel{

    @Override
    protected void start() {
        System.out.println("宝马……");
    }

    @Override
    protected void stop() {
        System.out.println("宝马……");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马……");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马……");
    }
}
