# Spring AI RAG Production Grade Backend

## 📚 Course Information

This repository contains the complete source code for the **Spring AI RAG Production Grade** course on Udemy. This comprehensive course teaches you how to build a production-ready Retrieval Augmented Generation (RAG) system using Spring AI framework.

🎓 **[Enroll in the Course on Udemy](https://www.udemy.com/course/spring-ai-rag-production-grade/?referralCode=CD2B723E718BED9503E3)**

## 🏗️ What You'll Build

A complete enterprise-grade RAG backend system featuring:
- 📄 Multi-format document ingestion (PDF, Wiki, Database)
- ✂️ Advanced text chunking strategies
- 🔍 Vector embeddings and semantic search
- 💾 Redis vector store integration
- 🧠 Intelligent retrieval and ranking
- 💬 Chat integration with context awareness
- 🔄 Complete knowledge lifecycle management

## 🛠️ Technology Stack

- **Spring Boot** 3.5.10
- **Spring AI** 1.1.2
- **Java** 17
- **OpenAI API** for LLM integration
- **Redis** for vector storage
- **Gradle** build system
- **PostgreSQL** for metadata storage

## 📖 Course Structure & Branches

Each lesson has its own dedicated branch. Checkout the specific branch to follow along with the course content.

| Module | Branch | Topic | Description |
|--------|--------|-------|-------------|
| **Module 1: Foundation** | | | |
| 1.2 | [`module1.2-setup`](../../tree/module1.2-setup) | Project Setup | Initial Spring Boot project configuration with Spring AI |
| 1.3 | [`module1.3-basic-chat`](../../tree/module1.3-basic-chat) | Basic Chat | Simple OpenAI integration and chat endpoint |
| **Module 2: Data Preparation** | | | |
| 2 | [`module2-data-prep`](../../tree/module2-data-prep) | Data Preparation | Setting up sample documents and data sources |
| **Module 3: Document Ingestion** | | | |
| 3.2 | [`module3.2-pdf-ingestion`](../../tree/module3.2-pdf-ingestion) | PDF Ingestion | Loading and processing PDF documents |
| 3.3 | [`module3.3-wiki-ingestion`](../../tree/module3.3-wiki-ingestion) | Wiki Ingestion | Ingesting markdown wiki documents |
| 3.4 | [`module3.4-database-ingestion`](../../tree/module3.4-database-ingestion) | Database Ingestion | Loading data from database sources |
| 3.5 | [`module3.5-ingestion-orchestration`](../../tree/module3.5-ingestion-orchestration) | Ingestion Orchestration | Coordinating multiple ingestion sources |
| **Module 4: Text Chunking** | | | |
| 4.2 | [`module4.2-fixed-size-chunking`](../../tree/module4.2-fixed-size-chunking) | Fixed Size Chunking | Basic text splitting with fixed chunk sizes |
| 4.3 | [`module4.3-chunk-overlap`](../../tree/module4.3-chunk-overlap) | Chunk Overlap | Implementing overlapping chunks for better context |
| 4.4 | [`module4.4-semantic-aware-chunking`](../../tree/module4.4-semantic-aware-chunking) | Semantic Chunking | Intelligent chunking based on content semantics |
| 4.5 | [`module4.5-chunking-pdfs`](../../tree/module4.5-chunking-pdfs) | PDF Chunking | Specialized chunking for PDF documents |
| 4.6 | [`module4.6-db-chunking`](../../tree/module4.6-db-chunking) | Database Chunking | Chunking structured database content |
| 4.7 | [`module4.7-chunking-orchestration`](../../tree/module4.7-chunking-orchestration) | Chunking Orchestration | Unified chunking pipeline |
| **Module 5: Vector Embeddings** | | | |
| 5.2 | [`module5.2-embedding-chunks`](../../tree/module5.2-embedding-chunks) | Embedding Chunks | Creating vector embeddings from text chunks |
| 5.4 | [`module5.4-vector-store-redis`](../../tree/module5.4-vector-store-redis) | Redis Vector Store | Implementing Redis as vector database |
| **Module 6: Information Retrieval** | | | |
| 6.2 | [`module6.2-retrieval-contract`](../../tree/module6.2-retrieval-contract) | Retrieval Contract | Defining retrieval service interfaces |
| 6.3 | [`module6.3-basic-vector-search`](../../tree/module6.3-basic-vector-search) | Vector Search | Basic similarity search implementation |
| 6.4 | [`module6.4-filter-by-metadata`](../../tree/module6.4-filter-by-metadata) | Metadata Filtering | Advanced filtering using metadata |
| 6.5 | [`module6.5-ranking-chunks`](../../tree/module6.5-ranking-chunks) | Chunk Ranking | Intelligent ranking of retrieved chunks |
| 6.6 | [`module6.6-integrating-retrieval-chat`](../../tree/module6.6-integrating-retrieval-chat) | Retrieval + Chat | Integrating retrieval with chat responses |
| **Module 7: Prompt Engineering** | | | |
| 7.2 | [`module7.2-prompt-contract`](../../tree/module7.2-prompt-contract) | Prompt Contract | Structuring prompt templates |
| 7.3 | [`module7.3-system-prompt`](../../tree/module7.3-system-prompt) | System Prompts | Creating effective system prompts |
| 7.4 | [`module7.4-context-builder`](../../tree/module7.4-context-builder) | Context Builder | Building context from retrieved chunks |
| 7.5 | [`module7.5-grounding-rules`](../../tree/module7.5-grounding-rules) | Grounding Rules | Implementing response grounding |
| 7.6 | [`module7.6-citation`](../../tree/module7.6-citation) | Citations | Adding source citations to responses |
| 7.7 | [`module7.7-prompt-orchestration`](../../tree/module7.7-prompt-orchestration) | Prompt Orchestration | Complete prompt management system |
| **Module 8: Knowledge Lifecycle** | | | |
| 8.2 | [`module8.2-knowledge-lifecycle`](../../tree/module8.2-knowledge-lifecycle) | Lifecycle Management | Knowledge management framework |
| 8.3 | [`module8.3-source-identity`](../../tree/module8.3-source-identity) | Source Identity | Tracking document sources |
| 8.4 | [`module8.4-delete-knowledge`](../../tree/module8.4-delete-knowledge) | Delete Knowledge | Removing outdated content |
| 8.5 | [`module8.5-re-ingest-knowledge`](../../tree/module8.5-re-ingest-knowledge) | Re-ingestion | Updating existing knowledge |
| 8.6 | [`module8.6-end-to-end-lifecycle-api`](../../tree/module8.6-end-to-end-lifecycle-api) | Complete API | Full lifecycle API implementation |

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Docker (for Redis)
- OpenAI API key

### Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/[your-username]/nexacorp-ai-backend.git
   cd nexacorp-ai-backend
   ```

2. **Checkout a specific module branch**
   ```bash
   git checkout module1.2-setup
   ```

3. **Set up environment variables**
   ```bash
   # Create application.properties or set environment variables
   SPRING_AI_OPENAI_API_KEY=your-openai-api-key
   ```

4. **Start Redis (Docker)**
   ```bash
   docker run -d --name redis-stack -p 6379:6379 -p 8001:8001 redis/redis-stack:latest
   ```

5. **Run the application**
   ```bash
   ./gradlew bootRun
   ```

### Testing the API

Once running, you can test the chat endpoint:

```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "Hello, what can you help me with?"}'
```

## 📁 Repository Structure

```
├── src/main/java/com/nexacorp/ai/
│   ├── chunking/          # Text chunking strategies
│   ├── config/            # Spring configuration
│   ├── controller/        # REST API controllers
│   ├── dto/               # Data transfer objects
│   ├── embedding/         # Vector embedding services
│   ├── ingestion/         # Document ingestion pipeline
│   ├── lifecycle/         # Knowledge lifecycle management
│   ├── prompt/            # Prompt engineering
│   ├── retrieval/         # Information retrieval
│   ├── service/           # Business services
│   └── vectorstore/       # Vector database integration
├── data/
│   ├── pdfs/              # Sample PDF documents
│   └── wiki/              # Sample wiki content
└── src/main/resources/
    └── prompts/           # Prompt templates
```

## 🎯 Learning Path

1. **Start with Module 1** - Get familiar with Spring AI basics
2. **Follow sequentially** - Each module builds upon the previous
3. **Experiment** - Try modifying the code to understand concepts
4. **Check branches** - Compare different approaches across modules

## 🤝 Contributing

This is a course repository, but if you find issues or improvements:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## 📞 Support

- **Course Q&A**: Use Udemy's course discussion section
- **Issues**: Create GitHub issues for code-related problems
- **Documentation**: Check Spring AI official documentation

## 📄 License

This project is for educational purposes as part of the Udemy course.

---

### 🌟 Ready to build production-grade RAG systems?

**[Start the Course Now →](https://www.udemy.com/course/spring-ai-rag-production-grade/?referralCode=CD2B723E718BED9503E3)**