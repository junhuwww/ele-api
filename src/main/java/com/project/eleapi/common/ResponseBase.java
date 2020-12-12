package com.project.eleapi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口返回基类
 * @author: hujun
 * @create: 2020-12-12 21:54
 */
@Data
public class ResponseBase<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private ResponseBase(int status) {
        this.status = status;
    }
    private ResponseBase(String msg) {
        this.msg = msg;
    }
    private ResponseBase(T data) {
        this.data = data;
    }

    private ResponseBase (int status, String msg){
        this.status = status;
        this.msg = msg;
    }
    private ResponseBase (int status, T data){
        this.status = status;
        this.data = data;
    }
    private ResponseBase (int status, String msg, T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    //使之不在json序列化结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }
    public static <T> ResponseBase<T> createBySuccess(){
        return new ResponseBase<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ResponseBase<T> createBySuccessMessage(String msg){
        return new ResponseBase<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ResponseBase<T> createBySuccess(T data){
        return new ResponseBase<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ResponseBase<T> createBySuccess(String msg , T data){
        return new ResponseBase<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }

    public static <T> ResponseBase<T> createByError(){
        return new ResponseBase<T>(ResponseCode.ERROR.getCode());
    }

    public static <T> ResponseBase<T> createByErrorMessage(String msg){
        return new ResponseBase<T>(ResponseCode.ERROR.getCode(),msg);
    }

    public static <T> ResponseBase<T> createByErrorCodeMessage(int errorCode , String msg){
        return new ResponseBase<T>(errorCode,msg);
    }

}
