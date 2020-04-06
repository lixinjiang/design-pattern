package cn.lixinjiang.newpattern.selection1;

import java.util.ArrayList;

/**
 * 规格书
 *
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("苏打", 3));
        userList.add(new User("牛苏", 13));
        userList.add(new User("大穗", 33));
        userList.add(new User("苏明成", 21));
        IUserProvider provider = new UserProvider(userList);
        // 定义一个规格书
        IUserSpecification userSpec = new UserByAgeThan(20);
        for (User u : provider.findUser(userSpec)) {
            System.out.println(u);
        }
        System.out.println("=============================");
        // 定义一个规格书
        IUserSpecification us = new UserByNameLike("%苏%");
        for (User u : provider.findUser(us)) {
            System.out.println(u);
        }

        System.out.println("=============================");
        IUserSpecification us1 = new UserByAgeThan(20);
        IUserSpecification us2 = new UserByNameLike("%苏%");
        for (User u : provider.findUser(us1.and(us2))) {
            System.out.println(u);
        }

    }
}
