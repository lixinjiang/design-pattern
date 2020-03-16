package cn.lixinjiang.observer.eg6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) throws IOException {

        DnsServer shServer = new SHDnsServer();
        DnsServer cnServer = new ChinaTopDnsServer();
        DnsServer topServer = new TopDnsServer();
        cnServer.setUpperServer(topServer);
        shServer.setUpperServer(cnServer);

        System.out.println("=====解析域名=====");

        while (true) {
            System.out.println("\n请输入域名（输入N退出）：");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (domain.equalsIgnoreCase("n")) {
                return;
            }
            Record record = new Record();
            record.setDomain(domain);
            shServer.update(null, record);
            System.out.println("=====DNS域名解析结束=====");
            System.out.println(record);
        }
    }
}
