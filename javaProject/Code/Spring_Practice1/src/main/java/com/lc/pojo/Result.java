package com.lc.pojo;

//封装网络请求后返回数据的统一格式

public class Result {
    private Integer code;//状态码：1 代表成功，0 代表失败
    private String msg;// 传输的信息：成功，或失败
    private Object data;// 具体的数据

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    public static Result success(){
        return new Result(1,"success",null);
    }
    public static Result err(String msg){
        return new Result(0,msg,null);
    }


    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
