package com.nexacorp.ai.service;

import com.nexacorp.ai.dto.ChatRequest;
import com.nexacorp.ai.dto.ChatResponse;
import com.nexacorp.ai.prompt.PromptOrchestrator;
import com.nexacorp.ai.prompt.model.ChatPrompt;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatClient chatClient;
    private final PromptOrchestrator promptOrchestrator;

    public ChatResponse chat(ChatRequest request) {
        String userMessage = request.message();

        ChatPrompt chatPrompt = promptOrchestrator.build(userMessage);

        String llmInput = chatPrompt.groundingRule()
                + "\n\n"
                + chatPrompt.context().contextText()
                + "\n\nUser Question:\n"
                + userMessage;

        String aiResponse = chatClient.prompt()
                .system(chatPrompt.systemInstructions().instructions())
                .user(llmInput)
                .call().content();

        return new ChatResponse(aiResponse);
    }
}
