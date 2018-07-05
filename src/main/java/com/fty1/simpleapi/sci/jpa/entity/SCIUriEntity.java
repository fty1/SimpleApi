package com.fty1.simpleapi.sci.jpa.entity;

import com.fty1.simpleapi.uci.generator.id.IncrementIdGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sci_sys_uri")
public class SCIUriEntity extends IncrementIdGenerator {

    private static final long serialVersionUID = 8644739386938293384L;

    private String uri;
    private String uriType;

    @Column(name = "`in`")
    private String in;

    @Column(name = "`out`")
    private String out;


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUriType() {
        return uriType;
    }

    public void setUriType(String uriType) {
        this.uriType = uriType;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
}
