package org.schhx.javademo.proxy.statics;

import org.schhx.javademo.proxy.ISubject;
import org.schhx.javademo.proxy.Subject;

/**
 * @author shanchao
 * @date 2018-09-28
 */
public class StaticClient {

    public static void main(String[] args) {
        ISubject proxy = new Proxy(new Subject());
        proxy.sayHello();

        System.out.println("\n\n");

        Subject proxy2 = new Proxy2();
        proxy2.sayHello();
    }
}
