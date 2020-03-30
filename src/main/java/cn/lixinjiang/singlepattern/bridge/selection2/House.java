package cn.lixinjiang.singlepattern.bridge.selection2;

/**
 * @Author lxj
 */
public class House extends Product {

    @Override
    public void beProduct() {
        System.out.println("");
    }

    @Override
    public void beSelled() {
        System.out.println();
    }
}
