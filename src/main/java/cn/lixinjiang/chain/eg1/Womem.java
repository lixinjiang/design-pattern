package cn.lixinjiang.chain.eg1;

/**
 * 1--未出嫁
 * 2--出嫁
 * 3--丧夫
 *
 * @Author lxj
 */
public class Womem implements IWomen {

    private int type = 0;

    private String request = "";

    public Womem(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
