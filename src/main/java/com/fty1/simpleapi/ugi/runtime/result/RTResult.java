package com.fty1.simpleapi.ugi.runtime.result;

import java.io.Serializable;

public class RTResult<T extends Serializable> {

    private Boolean success;
    private String code;
    private String msg;
    private T data;
    private RTResultPageInfo page;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    public void setData(T data) {
        this.data = data;
    }

    public RTResultPageInfo getPage() {
        return page;
    }

    public void setPage(RTResultPageInfo page) {
        this.page = page;
    }
}
