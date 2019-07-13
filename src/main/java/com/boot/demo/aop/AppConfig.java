package com.boot.demo.aop;

import com.boot.demo.configAnnoation.sySlog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Slf4j
public class AppConfig {

    @Around("@annotation(sySlog)")
    private Object anyOldTransfer(ProceedingJoinPoint joinPoint, sySlog sySlog) throws  Exception{
        Instant now = Instant.now();
        log.info("开始执行"+sySlog.name()+"方法");
        try {
            Object proceed = joinPoint.proceed();
            Instant end = Instant.now();
            long l = Duration.between(now, end).toMillis();
            log.info("方法执行完毕，耗时:{}豪秒",l);
            return proceed;
        } catch (Throwable throwable) {
        throw  new Exception();
        }

    }

}
