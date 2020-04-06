package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public class UserByAgeThan extends CompositeSpecification {

    private int age;

    public UserByAgeThan(int age) {
        this.age = age;
    }

    @Override
    public boolean isStatisfiedBy(User user) {
        return user.getAge() > age;
    }
}
