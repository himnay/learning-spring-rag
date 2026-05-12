package com.nexacorp.ai.chunking.model;

import java.util.Map;

public record Chunk(String source, String content, Map<String, Object> metadata, int chunkIndex) {
}
