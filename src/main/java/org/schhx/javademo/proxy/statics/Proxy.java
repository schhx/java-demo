package org.schhx.javademo.proxy.statics;

import org.schhx.javademo.proxy.ISubject;

/**
 * @author shanchao
 * @date 2018-09-28
 */
public class Proxy implements ISubject {

    private ISubject target;

    public Proxy(ISubject target) {
        this.target = target;
    }

    @Override
    public void sayHello() {
        System.out.println("proxy before");
        target.sayHello();
        System.out.println("proxy after");
    }
}
