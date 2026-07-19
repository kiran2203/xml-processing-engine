package com.kiran.xml_processing_engine.service.MessageProcessingOrchestrator;

import com.kiran.xml_processing_engine.xml.OrderMessageXml;

public interface MessageProcessingOrchestrator {
    OrderMessageXml processNextMessage();
}
