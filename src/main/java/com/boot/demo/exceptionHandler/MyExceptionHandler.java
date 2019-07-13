package com.boot.demo.exceptionHandler;

import com.boot.demo.common.HttpResult;
import com.boot.demo.exception.BaseException;
import com.boot.demo.resultenum.ResultEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public HttpResult exception(Exception e){
       if (e instanceof BaseException){
         return new HttpResult(ResultEnum.query_data_not_exist.getCode(),e.getMessage()) ;
       }
       if (e instanceof RuntimeException){
          return new HttpResult(ResultEnum.RUNTIME_ERRROR.getCode(),ResultEnum.RUNTIME_ERRROR.getMsg());
       }
       return new HttpResult(0,"系统出现异常，请稍后再试");
    };

}
