package com.simple.spidemo.impl;

import com.simple.spidemo.Protocol;
import com.simple.spidemo.Task;

/**
 * @Author: MikeWang
 * @Date: 2019/12/18 5:48 PM
 * @Description:
 */
public class TaskImplOne implements Task {
    @Override
    public String getName() {
        return "TaskImplOne";
    }

    @Override
    public String getName(Protocol url) {
        return null;
    }
}
