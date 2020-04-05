package cn.lixinjiang.function;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Predicate 型接口，是一个谓词型接口
 * 一个类似于bool类型判断的接口
 *
 * @Author lxj
 */
public class MagicPredicate {
    public static void main(String[] args) {

        Predicate<Integer> predicate = integer -> {
            if (integer > 5) {
                return true;
            }
            return false;
        };

        System.out.println(predicate.test(6));

        predicate = (t) -> t > 5;
        System.out.println(predicate.test(1));

        /*****************************************/

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 56, 6);
        List<Integer> list = stream.filter(predicate).collect(Collectors.toList());
        list.forEach(System.out::println);
        
    }
}
