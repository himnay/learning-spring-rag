package com.nexacorp.ai.retrieval;

import com.nexacorp.ai.chunking.model.Chunk;
import com.nexacorp.ai.retrieval.model.RetrievalResult;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RetrievalServiceTest {
    private static final Logger log = LoggerFactory.getLogger(RetrievalServiceTest.class);

    @Autowired
    private RetrievalService retrievalService;

    @Test
    void retrieve_test() {
        RetrievalResult result = retrievalService.retrieve("What is the work from home policy");

        log.info("Retrieval result - chunks found: {}" , result.chunks().size());
        for(Chunk chunk : result.chunks()) {
            log.info("Metadata    : {}", chunk.metadata());
            log.info("Content     : {}", chunk.content());
        }

    }
}
