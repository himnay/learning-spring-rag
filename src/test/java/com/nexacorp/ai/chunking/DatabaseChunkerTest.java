package com.nexacorp.ai.chunking;

import com.nexacorp.ai.chunking.model.Chunk;
import com.nexacorp.ai.ingestion.IngestionOrchestrator;
import com.nexacorp.ai.ingestion.model.IngestedDocument;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DatabaseChunkerTest {

    private static final Logger log = LoggerFactory.getLogger(DatabaseChunkerTest.class);

    @Autowired
    private IngestionOrchestrator ingestionOrchestrator;

    @Autowired
    private DatabaseChunker databaseChunker;

    @Test
    void testDatabaseChunking() throws Exception {
        List<IngestedDocument> documents = ingestionOrchestrator.ingestAll();

        List<IngestedDocument> dbDocuments = documents.stream()
                .filter(doc -> "DB".equals(doc.source()))
                .toList();

        for (IngestedDocument ingestedDocument : dbDocuments) {
            List<Chunk> chunks = databaseChunker.chunk(ingestedDocument);
            Chunk chunk = chunks.get(0);

            log.info("==== DB CHUNK ====");
            log.info("Source      : {}", chunk.source());
            log.info("Chunk Index : {}", chunk.chunkIndex());
            log.info("Metadata    : {}", chunk.metadata());
            log.info("Content     : {}", chunk.content());
        }

    }
}
