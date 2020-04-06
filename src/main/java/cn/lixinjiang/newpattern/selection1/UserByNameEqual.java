package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public class UserByNameEqual extends CompositeSpecification {

    private String name;

    public UserByNameEqual(String name) {
        this.name = name;
    }

    @Override
    public boolean isStatisfiedBy(User user) {
        return this.name.equals(user.getName());
    }
}
