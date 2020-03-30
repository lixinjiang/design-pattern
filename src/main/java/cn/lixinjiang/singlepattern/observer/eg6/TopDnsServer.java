package cn.lixinjiang.singlepattern.observer.eg6;

/**
 * @Author lxj
 */
public class TopDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Record record) {
        return true;
    }

    @Override
    protected void sign(Record record) {
        record.setOwner("全球顶级DNS服务器");
    }
}
