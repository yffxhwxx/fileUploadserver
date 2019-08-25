package com.bird.file.common.result;

public class BaseResult<T> {
     T data;
    private int code;
    private String messg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessg() {
        return messg;
    }

    public void setMessg(String messg) {
        this.messg = messg;
    }
}
