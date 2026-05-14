package com.nexacorp.ai.ingestion.wiki;

import com.nexacorp.ai.ingestion.model.IngestedDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class WikiIngestionService {
    private static final Logger log = LoggerFactory.getLogger(WikiIngestionService.class);
    private static final String WIKI_DIRECTORY = "/Users/himansu/Downloads/learning-spring-rag/src/main/resources/data/wiki/";

    public List<IngestedDocument> ingest(String fileName) throws IOException {
        File pdfFile = new File(WIKI_DIRECTORY + "/" + fileName);
        return Collections.singletonList(ingestSingleFile(pdfFile));
    }

    public List<IngestedDocument> ingestWikiFiles() throws Exception {
        File[] markdownFiles = new File(WIKI_DIRECTORY).listFiles();

        List<IngestedDocument> docs = new ArrayList<>();
        for(File file: markdownFiles){
            docs.add(ingestSingleFile(file));
        }
        return docs;
    }

    /**
     * Extract the text from the markdown file
     * @param file
     * @return
     * @throws IOException
     */
    private IngestedDocument ingestSingleFile(File file) throws IOException {
        String content = Files.readString(file.toPath());
        log.info(content);
        return new IngestedDocument(
                "WIKI",
                content,
                Map.of("fileName", file.getName(),
                        "identity", "WIKI#" + file.getName())
        );
    }

}
