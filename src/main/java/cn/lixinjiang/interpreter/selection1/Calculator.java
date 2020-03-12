package cn.lixinjiang.interpreter.selection1;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author lxj
 */
public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        // 定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符串数组
        char[] charArray = expStr.toCharArray();
        // 运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
