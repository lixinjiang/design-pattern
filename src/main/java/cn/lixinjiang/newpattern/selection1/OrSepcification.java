package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public class OrSepcification extends CompositeSpecification{

    private IUserSpecification left;

    private IUserSpecification right;

    public OrSepcification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isStatisfiedBy(User user) {
        return left.isStatisfiedBy(user) || right.isStatisfiedBy(user);
    }

}
