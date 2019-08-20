package com.boot.demo.resultenum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultEnum {
    query_data_not_exist(100,"查询无数据"),
    SUCCESS(0,"请求成功"),
    RUNTIME_ERRROR(101,"系统错误");
    private Integer code;
    private String msg;
}
