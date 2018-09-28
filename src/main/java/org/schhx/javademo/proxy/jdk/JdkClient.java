package org.schhx.javademo.proxy.jdk;

import org.schhx.javademo.proxy.ISubject;
import org.schhx.javademo.proxy.Subject;

import java.lang.reflect.Proxy;


/**
 * @author shanchao
 * @date 2018-09-27
 */
public class JdkClient {

    public static void main(String[] args) {
        // 保存生成的动态代理类
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        ISubject proxy = (ISubject) newProxyInstance(new Subject());
        proxy.sayHello();
    }

    public static Object newProxyInstance(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new JdkProxy(target)
        );
    }


}
