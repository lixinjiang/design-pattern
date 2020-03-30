package cn.lixinjiang.singlepattern.chain.eg2;

import cn.lixinjiang.singlepattern.chain.eg1.IWomen;

/**
 * @Author lxj
 */
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

    }
}
