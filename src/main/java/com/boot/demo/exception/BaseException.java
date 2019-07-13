package com.boot.demo.exception;

import com.boot.demo.resultenum.ResultEnum;
import sun.applet.resources.MsgAppletViewer;

public class BaseException extends Exception{

    private String msg;
    private Integer code;
    public BaseException(String msg,Integer code){
        super(msg);
        this.code=code;
    }
    public BaseException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code=100;
    }



}
