package cn.lixinjiang.prototype.eg1;

import java.util.Random;

/**
 * @Author lxj
 */
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandomString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandomString(6) + "@" + getRandomString(8) + ".com");
            sendMail(cloneMail);
            i++;
        }
    }

    public static String getRandomString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t……发送成功");
    }
}
