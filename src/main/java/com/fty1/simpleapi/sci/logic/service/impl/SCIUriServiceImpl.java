package com.fty1.simpleapi.sci.logic.service.impl;

import com.fty1.simpleapi.sci.jpa.entity.SCIUriEntity;
import com.fty1.simpleapi.sci.jpa.repository.SCUriRepository;
import com.fty1.simpleapi.sci.logic.service.SCIUriService;
import com.fty1.simpleapi.cci.runtime.result.RTResult;
import com.fty1.simpleapi.cci.runtime.result.RTResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SCIUriServiceImpl implements SCIUriService {

    @Autowired
    private SCUriRepository scUriRepository;

    @Override
    @Transactional()
    public RTResult<Boolean> save(SCIUriEntity data) {
        scUriRepository.save(data);
        return RTResultBuilder.success();
    }
}
