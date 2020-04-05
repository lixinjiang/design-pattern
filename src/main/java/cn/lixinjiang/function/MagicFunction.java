package cn.lixinjiang.function;

import static java.security.AccessController.doPrivileged;

import java.io.File;
import java.io.FileFilter;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Function作用是转化接口
 * 将一个值转化为另一个值
 *
 * @Author lxj
 */
public class MagicFunction {
    /**
     * 对象传递
     */
    Runnable r1 = () -> System.out.println(this);
    Runnable r2 = () -> System.out.println(toString());

    @Override
    public String toString() {
        return "hello world";
    }

    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
        Stream<Integer> stream1 = stream.map(function);
        stream1.forEach(System.out::println);
        Callable<Integer> integerCallable = () -> 42;
        IntBinaryOperator intBinaryOperator = Integer::sum;
        MagicInterface<String> tMagicInterface = System.out::println;

        FileFilter java = (File f) -> f.getName().endsWith("*.java");
        String user = doPrivileged((PrivilegedAction<String>) () -> System.getProperty("user.name"));
        Comparator<String> c = String::compareToIgnoreCase;
        System.out.println(c.compare("1", "2"));
        List<String> ls = Collections.emptyList();
        List<Integer> li = Collections.emptyList();
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, String> m2 = new HashMap<>();
        Supplier<Runnable> t = () -> () -> System.out.println("hh");
        t.get().run();
        boolean flag = c.compare("sdafadsf", "324") > 0;
        Callable<Integer> tt = flag ? (() -> 23) : (() -> 42);
        Object o = (Runnable) () -> System.out.println("hi");
        Collection<String> strings = Collections.checkedCollection(new ArrayList<>(), String.class);
        Set<Integer> s = flag ? Collections.singleton(23) : Collections.emptySet();

        new MagicFunction().r1.run();
        new MagicFunction().r2.run();
    }
}
