package cn.lixinjiang.interpreter.selection2;

/**
 * @Author lxj
 */
public class NonterminalExpression extends Expression {

    /**
     * 每个非终结符表达式都会对其他表达式产生依赖
     */
    public NonterminalExpression(Expression... expressions) {

    }

    @Override
    public Object interpreter(Context ctx) {
        // 进项文法处理
        return null;
    }
}
