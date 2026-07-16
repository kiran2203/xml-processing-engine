-- ============================================================
-- Scheduler Index
-- Used by:
--
-- SELECT TOP (1)
-- FROM input_xml_message
-- WHERE status = 'PENDING'
-- ORDER BY created_at
-- ============================================================

CREATE NONCLUSTERED INDEX IX_input_xml_message_status_created_at
ON input_xml_message
(
    status,
    created_at
);
GO

-- ============================================================
-- Recovery Scheduler Index
--
-- Used by:
--
-- SELECT *
-- FROM input_xml_message
-- WHERE status = 'PROCESSING'
-- AND processing_started_at < ?
-- ============================================================

CREATE NONCLUSTERED INDEX IX_input_xml_message_status_processing_started_at
ON input_xml_message
(
    status,
    processing_started_at
);
GO

