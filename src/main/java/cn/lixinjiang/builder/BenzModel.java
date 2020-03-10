package cn.lixinjiang.builder;

/**
 * @Author lxj
 */
public class BenzModel extends CarModel{

    @Override
    protected void start() {
        System.out.println("奔驰。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰。。。");
    }
}
