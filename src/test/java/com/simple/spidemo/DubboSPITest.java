package com.simple.spidemo;

import com.simple.spidemo.dubbospi.common.extension.ExtensionLoader;
import org.junit.Test;

import java.util.Map;

/**
 * @Author: MikeWang
 * @Date: 2019/12/13 6:51 PM
 * @Description:
 */
public class DubboSPITest {

    //自定义协议
    static Protocol protocol = new Protocol(){

        @Override
        public String getParameter(String key) {
            return key;
        }

        @Override
        public boolean hasParameter(String key) {
            return false;
        }

        @Override
        public String getParameter(String key, String defaultValue) {
            return key;
        }

        @Override
        public Map<String, String> getParameters() {
            return null;
        }
    };


    @Test
    public void sayHello() throws Exception {

        Robot defaultExtension =  ExtensionLoader.getExtensionLoader(Robot.class).getDefaultExtension();
        defaultExtension.sayHello();

        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

        Robot robot = ExtensionLoader.getExtensionLoader(Robot.class).getAdaptiveExtension();
        robot.sayHello();
        
    }
}
