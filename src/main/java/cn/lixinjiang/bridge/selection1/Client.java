package cn.lixinjiang.bridge;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------房地产公司是这样运行的------");
        // 先找到我的公司
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("------服装公司这样运行------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
