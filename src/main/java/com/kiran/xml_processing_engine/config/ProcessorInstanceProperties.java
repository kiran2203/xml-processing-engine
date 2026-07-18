package com.kiran.xml_processing_engine.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "processor.instance")
public class ProcessorInstanceProperties {

    private String name;

}