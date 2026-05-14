package com.nexacorp.ai.ingestion;

import com.nexacorp.ai.ingestion.model.IngestedDocument;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class IngestionOrchestratorTest {
    
    @Autowired
    private IngestionOrchestrator ingestionOrchestrator;

    @Test
    void ingestAll() throws Exception{
        List<IngestedDocument> docs = ingestionOrchestrator.ingestAll();
        System.out.println("Total docs = " + docs.size());

        docs.forEach(doc -> {
            System.out.println("SOURCE = " + doc.source());
            System.out.println(doc.content());
            System.out.println("----");
        });
    }
}
