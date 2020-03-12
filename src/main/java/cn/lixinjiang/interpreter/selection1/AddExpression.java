package cn.lixinjiang.interpreter.selection1;

import java.util.HashMap;

/**
 * 加法解析器
 *
 * @Author lxj
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
