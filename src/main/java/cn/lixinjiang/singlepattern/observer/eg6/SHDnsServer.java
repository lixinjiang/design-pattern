package cn.lixinjiang.singlepattern.observer.eg6;

/**
 * @Author lxj
 */
public class SHDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Record record) {
        return record.getDomain().endsWith(".sh.cn");
    }

    @Override
    protected void sign(Record record) {
        record.setOwner("上海DNS服务器");
    }
}
