package com.kiran.xml_processing_engine.service.parser;

import com.kiran.xml_processing_engine.exception.XmlParsingException;
import com.kiran.xml_processing_engine.xml.OrderMessageXml;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class XmlParserServiceImpl implements XmlParserService {
    private final JAXBContext jaxbContext;

    public XmlParserServiceImpl() {
        try {
            this.jaxbContext = JAXBContext.newInstance(OrderMessageXml.class);
        } catch (JAXBException e) {
            throw new XmlParsingException(
                    "Failed to initialize JAXBContext.",
                    e
            );
        }
    }

    @Override
    public OrderMessageXml parse(String xml) {

        if (xml == null || xml.isBlank()) {
            throw new IllegalArgumentException(
                    "XML content must not be null or blank."
            );
        }

        try {
            Unmarshaller unmarshaller =
                    jaxbContext.createUnmarshaller();

            return (OrderMessageXml)
                    unmarshaller.unmarshal(new StringReader(xml));

        } catch (JAXBException e) {

            throw new XmlParsingException(
                    "Failed to parse XML.",
                    e
            );
        }
    }
}

