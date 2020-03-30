package cn.lixinjiang.singlepattern.observer.eg6;

/**
 * BO 对象
 *
 * @Author lxj
 */
public class Record {
    private String domain;
    private String ip;
    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "域名：" + this.domain +
                "\nIP地址：" + this.ip +
                "\n解析者：" + this.owner;
    }
}
