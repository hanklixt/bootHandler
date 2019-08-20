package com.boot.demo.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;


@Component
public class MyCacheConfig {

    /**
     * 缓存key生成器
     * 目标方法名+参数值列表
     * @return
     */
    @Bean
    public KeyGenerator keyGenerator(){
      return new KeyGenerator() {
          @Override
          public Object generate(Object o, Method method, Object... objects) {
              return method.getName()+"["+ Arrays.asList(objects).toString()+"]";
          }
      };

    }
}
