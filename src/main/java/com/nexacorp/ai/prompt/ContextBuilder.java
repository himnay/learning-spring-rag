package com.nexacorp.ai.prompt;

import com.nexacorp.ai.chunking.model.Chunk;
import com.nexacorp.ai.prompt.model.PromptContext;
import com.nexacorp.ai.retrieval.model.RetrievalResult;

import java.util.Map;

public class ContextBuilder {

    public PromptContext build(RetrievalResult retrievalResult) {
        StringBuilder sb = new StringBuilder();

        int index = 1;
        for (Chunk chunk : retrievalResult.chunks()) {
            sb.append("Context ").append(index++).append(":\n");
            appendCitation(sb, chunk);
            sb.append(chunk.content());
            sb.append("\n\n");
        }

        return new PromptContext(sb.toString().trim());
    }

    /**
     * Build citation in the format [PDF:HR_Leave_policy.pdf] or [WIKI:Company_Policies] or [DB:faqs#5]
     * @param sb
     * @param chunk
     */
    private void appendCitation(StringBuilder sb, Chunk chunk) {
        Map<String, Object> metadata = chunk.metadata();
        String source = metadata.get("source").toString();

        switch(source) {
            case "PDF", "WIKI" :
                sb.append("[")
                        .append(source)
                        .append(": ").append(metadata.get("fileName"))
                        .append("]\n");
                break;
            case "DB":
                sb.append("[DB: ")
                        .append(metadata.get("table")).append("#")
                        .append(metadata.get("id"))
                        .append("]\n");
                break;
        }
    }
}
