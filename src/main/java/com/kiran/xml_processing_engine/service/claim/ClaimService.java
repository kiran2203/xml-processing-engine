package com.kiran.xml_processing_engine.service.claim;

import com.kiran.xml_processing_engine.entity.InputXmlMessage;

import java.util.Optional;

public interface ClaimService {
    Optional<InputXmlMessage> claimNextMessage();
}
