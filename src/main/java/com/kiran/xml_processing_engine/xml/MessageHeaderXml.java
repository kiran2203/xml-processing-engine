package com.kiran.xml_processing_engine.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageHeaderXml {

    private String messageUuid;

    private String messageType;

    private String sourceSystem;

    private String schemaVersion;

    private String createdTimestamp;

}