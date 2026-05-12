package com.nexacorp.ai.ingestion.model;

import java.util.Map;

public record IngestedDocument(String source, String content, Map<String, Object> metadata) {
}
