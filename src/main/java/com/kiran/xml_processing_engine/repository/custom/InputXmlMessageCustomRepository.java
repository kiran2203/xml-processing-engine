package com.kiran.xml_processing_engine.repository.custom;

import com.kiran.xml_processing_engine.entity.InputXmlMessage;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InputXmlMessageCustomRepository {
    Optional<InputXmlMessage> claimNextMessage(String processorInstance);
}
