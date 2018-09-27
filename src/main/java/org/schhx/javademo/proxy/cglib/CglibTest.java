package org.schhx.javademo.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import org.schhx.javademo.proxy.HelloImpl;

/**
 * @author shanchao
 * @date 2018-09-27
 */
public class CglibTest {

    public static void main(String[] args) {
        //将sam,class文件写到硬盘
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, ".//");

        HelloImpl proxy = (HelloImpl) ProxyFactory.newProxyInstance(HelloImpl.class);
        proxy.sayHello("Java");


    }
}
