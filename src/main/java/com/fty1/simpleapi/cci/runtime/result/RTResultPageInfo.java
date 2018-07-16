package com.fty1.simpleapi.cci.runtime.result;

public class RTResultPageInfo {

    private Long pageSize = 10L;
    private Long pageNumber = 1L;
    private Long totlePage;
    private Long totleItem;


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

    public Long getTotlePage() {
        return totlePage;
    }

    public void setTotlePage(Long totlePage) {
        this.totlePage = totlePage;
    }

    public Long getTotleItem() {
        return totleItem;
    }

    public void setTotleItem(Long totleItem) {
        this.totleItem = totleItem;
    }
}
