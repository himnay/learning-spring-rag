package com.nexacorp.ai.lifecycle;

import com.nexacorp.ai.lifecycle.model.KnowledgeRequest;
import com.nexacorp.ai.lifecycle.model.SourceType;

public class KnowledgeIdentity {

    public static String from(KnowledgeRequest request) {

        if (request.sourceType() == SourceType.PDF) {
            return "PDF#" + request.name();
        }

        if (request.sourceType() == SourceType.WIKI) {
            return "WIKI#" + request.name();
        }

        if (request.sourceType() == SourceType.DATABASE) {
            return "DB#" + request.name();
        }

        return "";
    }
}
