package cn.lixinjiang.function;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author lxj
 */
public class MagicConsumer {

    public static void main(String[] args) {
        // consumer 接口
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // lambda 表达式
        // 它表达了 Lambda 表达式的类型，函数式接口是方法签名（signature），lambda表达式是方法body,两者组成了一个整体。
        Consumer<String> consumer2 = (s) -> System.out.println(s);
        // 方法引用
        Consumer<String> consumer3 = System.out::println;

        System.out.println("----------------------------------");
        Stream<String> stream = Stream.of("aaa", "bbb", "ccc");
        stream.forEach(consumer1);
        System.out.println("----------------------------------");
        stream = Stream.of("aaa", "bbb", "ccc");
        stream.forEach(consumer2);
        System.out.println("----------------------------------");
        stream = Stream.of("aaa", "bbb", "ccc");
        stream.forEach(consumer3);

        System.out.println("----------------------------------");
        // 所以lambda 表达式的类型是函数式接口类型，前面不是说lambda 是个静态函数，为啥能赋值给个函数式接口；
        MagicInterface<Long> it = (s) -> System.out.println(s);
        Stream<Long> longStream = Stream.of(2L, 3L, 4L);

    }
}
