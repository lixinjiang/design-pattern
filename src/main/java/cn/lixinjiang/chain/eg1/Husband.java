package cn.lixinjiang.chain.eg1;

/**
 * @Author lxj
 */
public class Husband implements IHandler{

    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
