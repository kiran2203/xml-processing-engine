package com.kiran.xml_processing_engine.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name = "OrderMessage")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderMessageXml {

    @XmlElement(name = "MessageHeader")
    private MessageHeaderXml messageHeader;

    @XmlElement(name = "Order")
    private OrderXml order;

}
