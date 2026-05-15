package com.nexacorp.ai.prompt;

import com.nexacorp.ai.prompt.model.SystemInstructions;
import org.springframework.ai.chat.prompt.SystemPromptTemplate;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SystemPromptLoader {

    private static final String SYSTEM_PROMPT_PATH = "prompts/system-prompt.st";

    public SystemInstructions load() {
        SystemPromptTemplate template = new SystemPromptTemplate(new ClassPathResource(SYSTEM_PROMPT_PATH));
        String prompt = template.create().getContents();
        return new SystemInstructions(prompt);
    }
}
