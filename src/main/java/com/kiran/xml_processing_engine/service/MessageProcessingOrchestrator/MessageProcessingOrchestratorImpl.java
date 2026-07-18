package com.kiran.xml_processing_engine.service.MessageProcessingOrchestrator;

import com.kiran.xml_processing_engine.entity.InputXmlMessage;
import com.kiran.xml_processing_engine.service.XmlProcessing.XmlProcessingService;
import com.kiran.xml_processing_engine.service.claim.ClaimService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class MessageProcessingOrchestratorImpl implements MessageProcessingOrchestrator{

    private final ClaimService claimService;
    private final XmlProcessingService xmlProcessingService;

    @Override
    public void processNextMessage() {
        Optional<InputXmlMessage> message = claimService.claimNextMessage();

        if(message.isEmpty()){
            return;
        }
        return xmlProcessingService.process(message.get());
    }
}
