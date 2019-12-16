package com.simple.spidemo;

import org.junit.Test;

import java.util.ServiceLoader;


/**
 * @Author: MikeWang
 * @Date: 2019/12/13 5:28 PM
 * @Description:
 */
public class JavaSPITest {
    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
