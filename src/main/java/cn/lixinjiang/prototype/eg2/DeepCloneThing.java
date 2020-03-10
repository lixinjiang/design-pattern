package cn.lixinjiang.prototype.eg2;

import java.util.ArrayList;

/**
 * 深拷贝
 *
 * @Author lxj
 */
public class DeepCloneThing implements Cloneable {
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected DeepCloneThing clone() throws CloneNotSupportedException {
        DeepCloneThing thing = (DeepCloneThing) super.clone();
        this.list = (ArrayList<String>) this.list.clone();
        return thing;
    }

    public ArrayList<String> getValue() {
        return this.list;
    }

    public void setValue(String value) {
        this.list.add(value);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloneThing deepCloneThing = new DeepCloneThing();
        deepCloneThing.setValue("张三");
        DeepCloneThing clone = deepCloneThing.clone();
        System.out.println(deepCloneThing.getValue());
        System.out.println(clone.getValue());
        clone.setValue("李四");
        System.out.println(deepCloneThing.getValue());
        System.out.println(clone.getValue());
    }
}
