package com.fty1.simpleapi.cci.http.request;

import java.io.Serializable;

public class Fty1RequestBody<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = -8571918895859787208L;

    private T data;

    private Fty1RequestPageInfo page;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Fty1RequestPageInfo getPage() {
        return page;
    }

    public void setPage(Fty1RequestPageInfo page) {
        this.page = page;
    }
}
