package com.boot.demo.common;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class HttpResult {
    private Integer code;
    private String msg;
    private Object data;

    public HttpResult(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
