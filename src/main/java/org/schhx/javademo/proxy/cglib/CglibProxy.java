package org.schhx.javademo.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shanchao
 * @date 2018-09-27
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * @param obj    代理类
     * @param method 目标类方法
     * @param args   方法参数
     * @param proxy  方法代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib proxy before");
        // 调用代理类父类方法，即目标类方法
        // 注意不要使用 proxy.invoke(obj, args)
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("cglib proxy after");
        return result;
    }
}
