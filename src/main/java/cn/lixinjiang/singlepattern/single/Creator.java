package cn.lixinjiang.singlepattern.single;

/**
 * @Author lxj
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> tClass);
}
