package cn.lixinjiang.prototype.eg2;

/**
 * 通用原型
 * @Author lxj
 */
public class PrototypeClass implements Cloneable {

    @Override
    public PrototypeClass clone() throws CloneNotSupportedException {
        return (PrototypeClass) super.clone();
    }
}
