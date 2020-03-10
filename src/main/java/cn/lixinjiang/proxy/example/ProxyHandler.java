package cn.lixinjiang.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 切面（调用处理器）
 * @Author lxj
 */
public class ProxyHandler implements InvocationHandler {

    private Object proxied;

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do before");

        Object invoke = method.invoke(proxied, args);

        System.out.println("do after");

        return invoke;
    }
}
