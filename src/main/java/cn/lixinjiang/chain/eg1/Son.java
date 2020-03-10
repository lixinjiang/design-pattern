package cn.lixinjiang.chain.eg1;

/**
 * @Author lxj
 */
public class Son implements IHandler {

    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请求是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}