package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public class AndSpecification extends CompositeSpecification{

    private IUserSpecification left;

    private IUserSpecification right;

    public AndSpecification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isStatisfiedBy(User user) {
        return left.isStatisfiedBy(user) && right.isStatisfiedBy(user);
    }
}
