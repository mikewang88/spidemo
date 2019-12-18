package com.simple.spidemo;

import com.simple.spidemo.dubbospi.common.extension.SPI;

/**
 * @Author: MikeWang
 * @Date: 2019/12/13 5:21 PM
 * @Description:
 */
@SPI("optimusPrime")
public interface Robot {
    void sayHello();
}
