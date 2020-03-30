package cn.lixinjiang.singlepattern.visitor.eg1;

/**
 * @Author lxj
 */
public interface IVisitor {
    public void visit(Manager manager);

    public void visit(CommonEmployee employee);
}
