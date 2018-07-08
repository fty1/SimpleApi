package com.fty1.simpleapi.cci.http.response;

import java.io.Serializable;

public class Fty1ResponseBody<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 1172630592553893457L;
    private Boolean success;
    private String code;
    private String msg;
    private Object data;
    private Fty1ResponsePageInfo pageInfo;

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

    public void setData(Object data) {
        this.data = data;
    }

    public Fty1ResponsePageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Fty1ResponsePageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
