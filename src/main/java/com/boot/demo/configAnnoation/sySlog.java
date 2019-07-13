package com.boot.demo.configAnnoation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface sySlog {
    String  name() default "";
}
