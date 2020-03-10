package cn.lixinjiang.strategy;

/**
 * @Author lxj
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("one");
        context = new Context(new BackDoor());
        System.out.println();
    }
}
