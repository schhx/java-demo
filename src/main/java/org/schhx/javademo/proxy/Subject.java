package org.schhx.javademo.proxy;

/**
 * @author shanchao
 * @date 2018-09-27
 */
public class Subject implements ISubject {

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
