package org.schhx.javademo.proxy.pattern;

import org.schhx.javademo.proxy.Subject;

/**
 * @author shanchao
 * @date 2018-09-28
 */
public class Proxy2 extends Subject {

    @Override
    public void sayHello() {
        System.out.println("proxy2 before");
        super.sayHello();
        System.out.println("proxy2 after");
    }
}
