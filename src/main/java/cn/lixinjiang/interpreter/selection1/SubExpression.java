package cn.lixinjiang.interpreter.selection1;

import java.util.HashMap;

/**
 * @Author lxj
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) - super.right.interpreter(var);
    }
}
