package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public class NotSepcification extends CompositeSpecification {

    private IUserSpecification spec;

    public NotSepcification(IUserSpecification spec) {
        this.spec = spec;
    }

    @Override
    public boolean isStatisfiedBy(User user) {
        return !spec.isStatisfiedBy(user);
    }
}
