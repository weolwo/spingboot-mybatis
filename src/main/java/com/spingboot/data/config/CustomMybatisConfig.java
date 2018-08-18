package com.spingboot.data.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//自定义MyBatis的配置规则
@org.springframework.context.annotation.Configuration
public class CustomMybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {

        return  new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                //开启驼峰命名法的映射规则
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
