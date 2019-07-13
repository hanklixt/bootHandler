package com.boot.demo.controller;

import com.boot.demo.common.HttpResult;
import com.boot.demo.configAnnoation.sySlog;
import com.boot.demo.exception.BaseException;
import com.boot.demo.resultenum.ResultEnum;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController

public class HelloController {

    @sySlog(name="hello")
    @GetMapping("/hello")
    public String hello(){
      return "/hello";
    }

    @GetMapping("/mytTest/{type}")
    @sySlog(name = "myTest")
    @SneakyThrows
    public HttpResult mytTest(@PathVariable Integer type){
        switch (type){
            case 1:
                throw new BaseException(ResultEnum.query_data_not_exist.getMsg(),ResultEnum.query_data_not_exist.getCode());

            case 2:
                throw new Exception();
            default:
                throw new RuntimeException();

        }


    }

}
