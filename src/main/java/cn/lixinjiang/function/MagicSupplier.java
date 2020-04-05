package cn.lixinjiang.function;

import java.util.Optional;
import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 供给型接口
 * 相当于一个容器或者变量，可以存储值
 *
 * @Author lxj
 */
public class MagicSupplier {
    public static void main(String[] args) {
        // 使用 Supplier 接口实现方法，只有一个get方法，无参数，返回一个值
        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };

        System.out.println(supplier1.get());
        System.out.println("--------------------------------");

        // 使用lambda表达式
        supplier1 = () -> new Random().nextInt();
        System.out.println(supplier1.get());
        System.out.println("--------------------------------");

        // 使用方法引用
        Supplier<Double> supplier2 = Math::random;
        System.out.println(supplier2.get());

        /***************************************************************/

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> first = stream.filter(i -> i > 4).findFirst();
        System.out.println(first.orElse(1));
        System.out.println(first.orElse(7));
        System.out.println("---------------------------------");
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(first.orElseGet(supplier));

    }
}
