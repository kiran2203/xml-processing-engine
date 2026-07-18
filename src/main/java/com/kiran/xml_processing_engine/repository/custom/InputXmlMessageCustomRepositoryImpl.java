package com.kiran.xml_processing_engine.repository.custom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.kiran.xml_processing_engine.entity.InputXmlMessage;

import java.util.Optional;

@Repository
public class InputXmlMessageCustomRepositoryImpl implements InputXmlMessageCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<InputXmlMessage> claimNextMessage(String processorInstance) {

        return Optional.empty();

    }
}
