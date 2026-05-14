package com.nexacorp.ai.ingestion.pdf;

import com.nexacorp.ai.ingestion.model.IngestedDocument;
import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class PdfIngestionService {

    private static final String PDF_DIRECTORY = "/Users/himansu/Downloads/learning-spring-rag/src/main/resources/data/pdfs/";

    public List<IngestedDocument> ingest(String fileName) throws IOException {
        File pdfFile = new File(PDF_DIRECTORY + "/" + fileName);
        IngestedDocument doc = ingestSinglePdf(pdfFile);
        return Collections.singletonList(doc);
    }

    public List<IngestedDocument> ingestPdfs() throws Exception {
        File[] pdfFiles = new File(PDF_DIRECTORY).listFiles();

        List<IngestedDocument> docs = new ArrayList<>();

        for (File pdfFile : pdfFiles) {
            docs.add(ingestSinglePdf(pdfFile));
        }
        return docs;
    }

    /**
     * Extract the text from the pdf
     * @param pdfFile
     * @return
     * @throws IOException
     */
    private IngestedDocument ingestSinglePdf(File pdfFile) throws IOException {
        try (PDDocument document = PDDocument.load(pdfFile)) {
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            log.info(text);
            return new IngestedDocument(
                    "PDF",
                    text,
                    Map.of("fileName", pdfFile.getName(),
                            "identity", "PDF#" + pdfFile.getName())
            );
        }
    }
}
