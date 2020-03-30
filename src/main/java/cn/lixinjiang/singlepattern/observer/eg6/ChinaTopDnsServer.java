package cn.lixinjiang.singlepattern.observer.eg6;

/**
 * @Author lxj
 */
public class ChinaTopDnsServer extends DnsServer{

    @Override
    protected boolean isLocal(Record record) {
        return record.getDomain().endsWith(".cn");
    }

    @Override
    protected void sign(Record record) {
        record.setOwner("中国顶级DNS服务器");
    }
}
