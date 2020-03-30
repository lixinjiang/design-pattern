package cn.lixinjiang.singlepattern.proxy.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author lxj
 */
public interface InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws InvocationTargetException, IllegalAccessException;
}
