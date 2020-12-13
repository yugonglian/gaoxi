package com.gaoxi.service.exception;

import java.io.Serializable;

/**
 * Function: 通用业务异常
 *
 * @author longsun
 * @date 2020/12/11
 */
public class CommonBizException extends RuntimeException implements Serializable {

    private ExpCodeEnum codeEnum;

    public CommonBizException(ExpCodeEnum codeEnum){
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonBizException(){}

    public ExpCodeEnum getCodeEnum() {
        return codeEnum;
    }
}
