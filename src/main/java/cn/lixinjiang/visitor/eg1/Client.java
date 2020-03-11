package cn.lixinjiang.visitor.eg1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        for (Employee e : mockEmployee()) {
            e.accept(new Visitor());
        }

    }

    public static List<Employee> mockEmployee() {
        List<Employee> list = new ArrayList<>();

        CommonEmployee zs = new CommonEmployee();
        zs.setJob("编写程序");
        zs.setName("张三");
        zs.setSalary(1899);
        zs.setSex(Employee.MALE);
        list.add(zs);

        return list;
    }
}
