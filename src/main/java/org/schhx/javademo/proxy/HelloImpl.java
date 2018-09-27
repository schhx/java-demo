package org.schhx.javademo.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shanchao
 * @date 2018-09-27
 */
@Slf4j
public class HelloImpl implements Hello {

    @Override
    public void sayHello(String name) {
        log.info("hello {}", name);
    }
}
