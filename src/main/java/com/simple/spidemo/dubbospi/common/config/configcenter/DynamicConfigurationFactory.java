/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.simple.spidemo.dubbospi.common.config.configcenter;

import com.simple.spidemo.dubbospi.common.URL;
import com.simple.spidemo.dubbospi.common.extension.ExtensionLoader;
import com.simple.spidemo.dubbospi.common.extension.SPI;

import static com.simple.spidemo.dubbospi.common.extension.ExtensionLoader.getExtensionLoader;

/**
 * The factory interface to create the instance of {@link DynamicConfiguration}
 */
@SPI("nop") // 2.7.5 change the default SPI implementation
public interface DynamicConfigurationFactory {

    DynamicConfiguration getDynamicConfiguration(URL url);

    /**
     * Get an instance of {@link DynamicConfigurationFactory} by the specified name. If not found, take the default
     * extension of {@link DynamicConfigurationFactory}
     *
     * @param name the name of extension of {@link DynamicConfigurationFactory}
     * @return non-null
     * @see 2.7.4
     */
    static DynamicConfigurationFactory getDynamicConfigurationFactory(String name) {
        Class<DynamicConfigurationFactory> factoryClass = DynamicConfigurationFactory.class;
        ExtensionLoader<DynamicConfigurationFactory> loader = getExtensionLoader(factoryClass);
        return loader.getOrDefaultExtension(name);
    }
}
