package cn.lixinjiang.prototype.eg2;

/**
 * @Author lxj
 */
public class Thing implements Cloneable {
    public Thing() {
        System.out.println("构造函数被执行了……");
    }

    @Override
    protected Thing clone() throws CloneNotSupportedException {
        return (Thing) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Thing thing = new Thing();
        Thing cloneTHing = thing.clone();
    }
}
