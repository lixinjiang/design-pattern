package cn.lixinjiang.singlepattern.chain.eg2;

import cn.lixinjiang.singlepattern.chain.eg1.IWomen;

/**
 * @Author lxj
 */
public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

    }
}
