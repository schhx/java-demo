package org.schhx.javademo.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shanchao
 * @date 2018-09-27
 */
@Slf4j
public class ProxyFactory {

    public static Object newProxyInstance(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log.info("before invoke");
                        Object result = method.invoke(target, args);
                        log.info("after invoke");
                        return result;
                    }
                }
        );
    }
}
