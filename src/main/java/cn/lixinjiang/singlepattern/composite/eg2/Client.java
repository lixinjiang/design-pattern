package cn.lixinjiang.singlepattern.composite.eg2;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {

    }

    public static void display(Component root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
