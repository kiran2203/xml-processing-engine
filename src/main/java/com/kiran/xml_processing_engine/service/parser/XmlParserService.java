package com.kiran.xml_processing_engine.service.parser;

import com.kiran.xml_processing_engine.xml.OrderMessageXml;

public interface XmlParserService {
    OrderMessageXml parse(String xml);
}
