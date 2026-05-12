package com.nexacorp.ai.lifecycle.model;

import lombok.Builder;

@Builder
public record KnowledgeRequest(SourceType sourceType, String name) {
}
