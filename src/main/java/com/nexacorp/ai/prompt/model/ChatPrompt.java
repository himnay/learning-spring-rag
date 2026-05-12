package com.nexacorp.ai.prompt.model;

public record ChatPrompt(SystemInstructions systemInstructions, PromptContext context, String groundingRule) {
}
