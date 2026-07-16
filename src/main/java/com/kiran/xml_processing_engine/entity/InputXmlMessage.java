package com.kiran.xml_processing_engine.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "input_xml_message")
public class InputXmlMessage extends BaseEntity{

    @Column(
            name = "message_uuid",
            nullable = false,
            unique = true,
            length = 36
    )
    private String messageUuid;

    @Column(nullable = false,
            length = 64)
    private String checksum;

    @Lob
    @Column(
            name = "xml_message",
            nullable = false
    )
    private String xmlMessage;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "status",
            nullable = false)
    private ProcessingStatus status;

    @Column(
            name = "retry_count",
            nullable = false)
    private Integer retryCount;

    @Column(
            name = "processor_instance",
            nullable = true,
            length = 100)
    private String processorInstance;

    @Column(
            name = "processing_started_at")
    private LocalDateTime processingStartedAt;

    @Column(
            name = "processed_at")
    private LocalDateTime processedAt;

    @Column(
            name = "error_message",
            length = 1000)
    private String errorMessage;
}
