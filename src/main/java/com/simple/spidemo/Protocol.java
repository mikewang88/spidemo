package com.simple.spidemo;

import java.util.Map;

/**
 * @Author: MikeWang
 * @Date: 2019/12/18 5:56 PM
 * @Description:
 */
public interface Protocol {
    String getParameter(String key);

    boolean hasParameter(String key);

    String getParameter(String key, String defaultValue);

    Map<String, String> getParameters();

}
