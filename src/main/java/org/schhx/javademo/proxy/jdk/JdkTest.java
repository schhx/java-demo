package org.schhx.javademo.proxy.jdk;

import org.schhx.javademo.proxy.Hello;
import org.schhx.javademo.proxy.HelloImpl;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author shanchao
 * @date 2018-09-27
 */
public class JdkTest {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        Hello helloProxy = (Hello) ProxyFactory.newProxyInstance(hello);
        helloProxy.sayHello("Java");
    }

    public static void showProxyClass() {
        String path = "./$Proxy0.class";
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0",
                HelloImpl.class.getInterfaces());
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path);
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
