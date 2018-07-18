package com.fty1.simpleapi.sci.refer.uri;


/**
 * protocol :// hostname[:port] / path / [;parameters][?query]#fragment
 */

public interface URI {

    String protocol();

    String hostname();

    String port();

    String path();

    String parameters();

    String query();

    String fragment();
}
