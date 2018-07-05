package com.fty1.simpleapi.ugi.http;

import com.fty1.simpleapi.ugi.http.response.Fty1ResponsePageInfo;
import com.fty1.simpleapi.ugi.runtime.result.RTResultPageInfo;

public class Fty1ResponsePageInfoBuilder {

    private static Fty1ResponsePageInfo builder(Long pageSize, Long pageNumber, Long totlePage, Long totleItem) {
        Fty1ResponsePageInfo fty1ResponsePageInfo = new Fty1ResponsePageInfo();
        fty1ResponsePageInfo.setPageSize(pageSize);
        fty1ResponsePageInfo.setPageNumber(pageNumber);
        fty1ResponsePageInfo.setTotlePage(totlePage);
        fty1ResponsePageInfo.setTotleItem(totleItem);
        return fty1ResponsePageInfo;
    }

    public static Fty1ResponsePageInfo buildByRTResult(RTResultPageInfo pageInfo) {

        if (null == pageInfo) {
            return null;
        }

        return builder(pageInfo.getPageSize(),pageInfo.getPageNumber(),pageInfo.getTotlePage(),pageInfo.getTotleItem());
    }
}
