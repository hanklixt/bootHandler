package com.boot.demo.util;

import com.boot.demo.common.HttpResult;
import com.boot.demo.resultenum.ResultEnum;
import lombok.experimental.UtilityClass;

/**
 * 返回工具类
 * @author lxt
 * @date 2019-08-20
 */
@UtilityClass
public class HttpResultUtils {

    /**
     * 返回成功通用方法
     * @param object
     * @return
     */
    public HttpResult success(Object object){

        HttpResult result=new HttpResult();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
}
