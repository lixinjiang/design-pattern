package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public abstract class CompositeSpecification implements IUserSpecification {

    /**
     * @param user
     *
     * @return
     */
    @Override
    public abstract boolean isStatisfiedBy(User user);

    @Override
    public IUserSpecification and(IUserSpecification spec) {
        return new AndSpecification(this, spec);
    }

    @Override
    public IUserSpecification or(IUserSpecification spec) {
        return new NotSepcification(this);
    }

    @Override
    public IUserSpecification not(IUserSpecification spec) {
        return new OrSepcification(this, spec);
    }
}
