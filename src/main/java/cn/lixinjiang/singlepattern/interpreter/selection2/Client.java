package cn.lixinjiang.singlepattern.interpreter.selection2;

import java.util.Stack;

/**
 * @Author lxj
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        Stack<Expression> stack = new Stack<>();
        for (; ; ) {
            // 进行语法判断，并产生递归调用

        }
        // 产生一个完整的语法树，由各个具体的语法分析进行解析
//        Expression expression = stack.pop();
//        expression.interpreter(ctx);
    }
}
