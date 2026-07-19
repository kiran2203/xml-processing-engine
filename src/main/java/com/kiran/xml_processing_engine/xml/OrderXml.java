package com.kiran.xml_processing_engine.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderXml {

    @XmlElement(name = "OrderHeader")
    private OrderHeaderXml orderHeader;

    @XmlElement(name = "Customer")
    private CustomerXml customer;

    @XmlElement(name = "Payment")
    private PaymentXml payment;

    @XmlElement(name = "Shipping")
    private ShippingXml shipping;

    @XmlElement(name = "OrderItems")
    private OrderItemsXml orderItems;

}