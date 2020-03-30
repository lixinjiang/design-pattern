package cn.lixinjiang.singlepattern.prototype.eg2;

import java.util.ArrayList;

/**
 * 浅拷贝
 * @Author lxj
 */
public class ShallowCloneThing implements Cloneable{
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected DeepCloneThing clone() throws CloneNotSupportedException {
        return (DeepCloneThing) super.clone();
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
