package cn.lixinjiang.chain.eg2;

import cn.lixinjiang.chain.eg1.IWomen;

/**
 * @Author lxj
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

    }
}
