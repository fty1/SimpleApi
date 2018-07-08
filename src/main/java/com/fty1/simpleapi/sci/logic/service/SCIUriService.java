package com.fty1.simpleapi.sci.logic.service;

import com.fty1.simpleapi.sci.jpa.entity.SCIUriEntity;
import com.fty1.simpleapi.cci.runtime.result.RTResult;

public interface SCIUriService {

    RTResult<Boolean> save(SCIUriEntity data);
}
