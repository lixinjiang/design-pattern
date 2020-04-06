package cn.lixinjiang.newpattern.selection1;

/**
 * @Author lxj
 */
public interface IUserSpecification {
    /**
     * 候选者是否满足要求
     */
    public boolean isStatisfiedBy(User user);

    /**
     * and 操作
     *
     * @param spec
     *
     * @return
     */
    public IUserSpecification and(IUserSpecification spec);

    /**
     * or 操作
     *
     * @param spec
     *
     * @return
     */
    public IUserSpecification or(IUserSpecification spec);

    /**
     * not 操作
     *
     * @param spec
     *
     * @return
     */
    public IUserSpecification not(IUserSpecification spec);

}
