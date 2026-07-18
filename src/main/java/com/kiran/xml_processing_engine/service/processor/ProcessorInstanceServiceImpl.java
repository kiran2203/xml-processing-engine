package com.kiran.xml_processing_engine.service.processor;

import com.kiran.xml_processing_engine.config.ProcessorInstanceProperties;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProcessorInstanceServiceImpl implements ProcessorInstanceService {


    private final ProcessorInstanceProperties properties;

    @Override
    public String getInstanceName() {
        return properties.getName();
    }
}
