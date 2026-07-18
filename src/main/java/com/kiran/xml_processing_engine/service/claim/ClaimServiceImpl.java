package com.kiran.xml_processing_engine.service.claim;


import com.kiran.xml_processing_engine.config.ProcessorInstanceProperties;
import com.kiran.xml_processing_engine.entity.InputXmlMessage;
import com.kiran.xml_processing_engine.repository.InputXmlMessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClaimServiceImpl implements ClaimService {

    private final InputXmlMessageRepository repository;
    private final ProcessorInstanceProperties properties;

    @Override
    @Transactional
    public Optional<InputXmlMessage> claimNextMessage() {

        String processorInstance = "INSTANCE-1";

        Optional<InputXmlMessage> claimedMessage =
                repository.claimNextMessage(properties.getName());

        if (claimedMessage.isEmpty()) {
            log.debug("No pending XML messages found.");
            return Optional.empty();
        }

        // spring translated sql exceptions to the data access exceptions
        claimedMessage.ifPresent(message ->
                log.info(
                        "Processor [{}] claimed message [{}]",
                        processorInstance,
                        message.getMessageUuid()
                ));

        return claimedMessage;
    }
}