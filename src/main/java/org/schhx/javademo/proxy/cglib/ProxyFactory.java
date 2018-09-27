package org.schhx.javademo.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shanchao
 * @date 2018-09-27
 */
@Slf4j
public class ProxyFactory {

    public static Object newProxyInstance(Class superclass) {
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(superclass);
        //设置回调函数
        en.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                log.info("before invoke");
                Object result = proxy.invokeSuper(obj, args);
                log.info("after invoke");
                return result;
            }
        });
        //创建子类对象代理
        return en.create();
    }
}
