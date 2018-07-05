package com.fty1.simpleapi.sci.model.uri.http;

import com.fty1.simpleapi.sci.SCI;
import com.fty1.simpleapi.sci.SCIParamter;
import com.fty1.simpleapi.sci.constant.SciTypeEnum;

public class HttpSci implements SCI {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String uri() {
        return null;
    }

    @Override
    public String uriType() {
        return SciTypeEnum.HTTP.name();
    }

    @Override
    public SCIParamter in() {
        return null;
    }

    @Override
    public SCIParamter out() {
        return null;
    }
}
