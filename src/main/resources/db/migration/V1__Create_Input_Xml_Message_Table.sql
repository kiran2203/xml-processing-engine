CREATE TABLE input_xml_message
(
    id BIGINT IDENTITY(1,1) NOT NULL,

    message_uuid CHAR(36) NOT NULL,

    checksum CHAR(64) NOT NULL,

    xml_message VARCHAR(MAX) NOT NULL,

    status VARCHAR(20) NOT NULL
        CONSTRAINT DF_input_xml_message_status
        DEFAULT 'PENDING',

    retry_count INT NOT NULL
        CONSTRAINT DF_input_xml_message_retry_count
        DEFAULT 0,

    processor_instance VARCHAR(100) NULL,

    processing_started_at DATETIME2 NULL,

    processed_at DATETIME2 NULL,

    error_message VARCHAR(1000) NULL,

    version BIGINT NOT NULL
        CONSTRAINT DF_input_xml_message_version
        DEFAULT 0,

    created_at DATETIME2 NOT NULL
        CONSTRAINT DF_input_xml_message_created_at
        DEFAULT SYSUTCDATETIME(),

    updated_at DATETIME2 NOT NULL
        CONSTRAINT DF_input_xml_message_updated_at
        DEFAULT SYSUTCDATETIME(),

    CONSTRAINT PK_input_xml_message
        PRIMARY KEY (id),

    CONSTRAINT UQ_input_xml_message_message_uuid
        UNIQUE (message_uuid)
);