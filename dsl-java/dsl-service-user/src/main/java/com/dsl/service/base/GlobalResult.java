package com.dsl.service.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author <P> HYF on 2019/6/24 <P>
 * @description  结果返回对象
 * @return
 */
@ApiModel(value = "响应数据包")
public class GlobalResult<T> implements Serializable{

    private static final long serialVersionUID = -5634941112111215322L;

    @ApiModelProperty(value = "状态码")
    private int code;
    @ApiModelProperty(value = "提示信息")
    private String msg;
    @ApiModelProperty(value = "响应数据")
    private T data;

    public GlobalResult() {
    }

    public GlobalResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public GlobalResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public boolean isSuccess(){
        return CodeConstant.CODE_SUCCESS == this.code;
    }



    public static GlobalResult success(){
        return new GlobalResult(CodeConstant.CODE_SUCCESS,"success");
    }
    public static GlobalResult successMsg(String msg){
        return new GlobalResult(CodeConstant.CODE_SUCCESS,msg);
    }
    public static <E> GlobalResult success(E data){
        return new GlobalResult(CodeConstant.CODE_SUCCESS,"success",data);
    }


    public static GlobalResult fail(String msg){
        return new GlobalResult(CodeConstant.CODE_ERROR,msg);
    }


    public static GlobalResult paramInvalid(String msg){
        return new GlobalResult(CodeConstant.CODE_PARAM_INVALID,msg);
    }

    public static GlobalResult build(int code, String msg){
        return new GlobalResult(code,msg);
    }



}