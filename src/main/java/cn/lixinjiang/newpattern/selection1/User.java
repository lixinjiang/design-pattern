package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public class User {

    private String name;
    private int age;

    public User(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "用户名：" + name + "\t年龄:" + age;
    }
}
