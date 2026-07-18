package com.kiran.xml_processing_engine.repository;

import com.kiran.xml_processing_engine.entity.InputXmlMessage;
import com.kiran.xml_processing_engine.repository.custom.InputXmlMessageCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputXmlMessageRepository extends JpaRepository<InputXmlMessage, Long>, InputXmlMessageCustomRepository {
}
