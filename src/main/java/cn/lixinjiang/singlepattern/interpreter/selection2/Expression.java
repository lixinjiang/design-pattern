package cn.lixinjiang.singlepattern.interpreter.selection2;

/**
 * @Author lxj
 */
public abstract class Expression {
    public abstract Object interpreter(Context ctx);
}
