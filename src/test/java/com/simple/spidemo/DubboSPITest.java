package com.simple.spidemo;

import com.simple.spidemo.dubbospi.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @Author: MikeWang
 * @Date: 2019/12/13 6:51 PM
 * @Description:
 */
public class DubboSPITest {
    @Test
    public void sayHello() throws Exception {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
//        Robot bumblebee = extensionLoader.getExtension("bumblebee");
//        bumblebee.sayHello();
    }
}
