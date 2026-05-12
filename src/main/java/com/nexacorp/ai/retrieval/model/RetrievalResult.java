package com.nexacorp.ai.retrieval.model;

import com.nexacorp.ai.chunking.model.Chunk;

import java.util.List;

public record RetrievalResult(List<Chunk> chunks) {
}
