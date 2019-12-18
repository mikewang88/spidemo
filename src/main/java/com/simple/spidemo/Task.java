package com.simple.spidemo;

import com.simple.spidemo.dubbospi.common.extension.Adaptive;
import com.simple.spidemo.dubbospi.common.extension.SPI;

/**
 * @Author: MikeWang
 * @Date: 2019/12/18 5:46 PM
 * @Description:
 */
@SPI("taskThree")
@Adaptive
public interface Task {
    String getName();
    @Adaptive({"taskOne"})
    String getName(Protocol url);
}
