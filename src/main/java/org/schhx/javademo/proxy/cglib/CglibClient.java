package org.schhx.javademo.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import org.schhx.javademo.proxy.Subject;

/**
 * @author shanchao
 * @date 2018-09-27
 */
public class CglibClient {

    public static void main(String[] args) {
        // 保存生成的动态代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, ".//");

        Subject proxy = (Subject) newProxyInstance(Subject.class);
        proxy.sayHello();


    }

    public static Object newProxyInstance(Class superclass) {
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(superclass);
        //设置回调函数
        en.setCallback(new CglibProxy());
        //创建子类对象代理
        return en.create();
    }
}
