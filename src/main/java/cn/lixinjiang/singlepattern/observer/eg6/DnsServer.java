package cn.lixinjiang.singlepattern.observer.eg6;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * 抽象 dns 服务器
 * 既是观察者，又是被观察者
 *
 * @Author lxj
 */
public abstract class DnsServer extends Observable implements Observer {

    /**
     * 处理请求,接收到事件后的处理，观察者身份
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        Record record = (Record) arg;
        if (isLocal(record)) {
            record.setIp(genIpAddress());
        } else {
            responseFromUpperServer(record);
        }
        sign(record);
    }

    /**
     * 作为被观察者，允许增加观察者，这里上级DNS一般只有一个
     *
     * @param dnsServer
     */
    public void setUpperServer(DnsServer dnsServer) {
        // 先清空，然后再增加
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    private void responseFromUpperServer(Record record) {
        super.setChanged();
        super.notifyObservers(record);
    }

    protected abstract boolean isLocal(Record record);

    protected abstract void sign(Record record);

    private String genIpAddress() {
        Random random = new Random();
        String address =
                random.nextInt(255) + "." + random.nextInt((255)) + "." + random.nextInt((255)) + "." + random
                        .nextInt((255));
        return address;
    }
}
