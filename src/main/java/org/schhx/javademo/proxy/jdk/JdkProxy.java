package org.schhx.javademo.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author shanchao
 * @date 2018-09-27
 */
@Slf4j
public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  代理类
     * @param method 目标类方法
     * @param args   方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk proxy before");
        Object result = method.invoke(target, args);
        System.out.println("jdk proxy after");
        return result;
    }
}
