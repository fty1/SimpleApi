package com.fty1.simpleapi.cci.http.request;

import java.io.Serializable;

public class Fty1RequestPageInfo implements Serializable {
    private static final long serialVersionUID = -8707812410320965048L;

    private Long pageSize = 10L;
    private Long pageNumber = 1L;

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }
}
