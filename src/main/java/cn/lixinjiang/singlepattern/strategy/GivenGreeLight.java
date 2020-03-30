package cn.lixinjiang.singlepattern.strategy;

/**
 * @Author lxj
 */
public class GivenGreeLight implements IStrategy{

    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
