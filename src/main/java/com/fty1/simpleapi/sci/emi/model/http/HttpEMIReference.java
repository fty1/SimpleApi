package com.fty1.simpleapi.sci.evi.model.http;

import com.fty1.simpleapi.sci.evi.EVIReference;

public class HttpEVIReference implements EVIReference {

    private String ip;
    private String port;

    private String protocol;


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
