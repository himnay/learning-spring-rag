package com.nexacorp.ai.embedding.model;


import com.nexacorp.ai.chunking.model.Chunk;

public record EmbeddedChunk(Chunk chunk, float[] vector) {
}
