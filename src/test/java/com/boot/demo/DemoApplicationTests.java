package com.boot.demo;

import com.boot.demo.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    Emp emp;
    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

    @Test
    public void logTest() {
        System.out.println(emp);
        //默认日志等级为info
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
