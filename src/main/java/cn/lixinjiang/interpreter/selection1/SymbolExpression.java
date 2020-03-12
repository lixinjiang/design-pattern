package cn.lixinjiang.interpreter.selection1;

/**
 * 符号解析器
 *
 * @Author lxj
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
