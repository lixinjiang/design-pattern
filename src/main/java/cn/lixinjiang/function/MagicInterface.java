package cn.lixinjiang.function;

/**
 * 该注解说明支持lambda表达式
 *
 * @Author lxj
 */
@FunctionalInterface
public interface MagicInterface<T> {

    void exec(T t);

}
