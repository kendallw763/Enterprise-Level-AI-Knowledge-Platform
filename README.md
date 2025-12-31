# 🤘🏾 Enterprise-AI-Knowledge-Platform
A production grade, AI enabled backend system that allows organizations to ingest internal documents, APIs, and structured data, then query them via secure REST endpoints using Retrieval Augmented Generation (RAG). This single project demonstrates backend engineering, AI integration, data modeling, system design, DevOps, and a touch of frontend.



# 🪨 Core Features

**Document Ingestion**
Upload PDFs / Markdown / Text
Chunk documents
Generate embeddings
Store vectors + metadata

**Semantic Search**
Query embeddings
Cosine similarity search
TopK context retrieval

**RAG Question Answering**
Inject retrieved context
Prompt templating
Deterministic responses

**REST API Endpoints**
`POST /documents`
`POST /query`
`GET /documents/{id}`

**Observability**
Structured logging
Error handling
Rate limiting (basic)


# ☕️ Java 17+ (Core Tech Stack)
Backend & APIs, Spring Boot (REST, Security, Validation), Spring Data JPA

# 🍃 SpringBoot Dependencies

## I/O
**Validation I/O** – Bean validation with Hibernate Validator.

## SQL
**Spring Data JP**A – Persist data in SQL stores using Java Persistence API with Spring Data and Hibernate.

**PostgreSQL Driver SQL** – A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database-independent Java code.

**Spring Data JDBC** – Persist data in SQL stores using plain JDBC with Spring Data.

## AI
**PGvector Vector Database AI** – Spring AI support for PGvector, an open-source PostgreSQL extension that enables storing and searching over machine learning-generated embeddings.

**OpenAI AI** – Spring AI support for ChatGPT (language model) and DALL-E (image generation model) from OpenAI.

## Security
**OAuth2 Authorization Server** – Spring Boot integration for Spring Authorization Server.

**Spring Securit**y – Highly customizable authentication and access-control framework for Spring applications.

## Developer Tools
**Spring Configuration Processor** – Generates metadata for developers to offer contextual help and code completion when working with custom configuration keys (e.g., application.properties or .yml files).

## Testing
**Testcontainers** – Provides lightweight, throwaway instances of common databases, Selenium web browsers, or any other service that can run in a Docker container.

**Spring REST Docs** – Documents RESTful services by combining hand-written ASCII doctor content with auto-generated snippets produced using Spring MVC Test.

## Web
**Spring Web** – Build web applications, including RESTful services, using Spring MVC. Uses Apache Tomcat as the default embedded container.

## Ops
**Spring Boot Actuator** – Supports built-in or custom endpoints that let you monitor and manage your application, including application health, metrics, sessions, etc.

# 🐍 Python (Supporting Role) Python 3.x for scripting:
Document ingestion, Batch embedding generation, Data cleanup & preprocessing

# 🤯 HTML / CSS / JavaScript
Incorperates scablable frontend & connection to the backend

# 🧪 Snyk
Dependency Vulnerability Testing

# 🤖 AI / Generative AI
Applied Generative AI (LLM Application Engineering), LLM APIs (OpenAI / Azure OpenAI / Anthropic), Retrieval Augmented Generation (RAG), Text Embeddings & Semantic Search, LangChain4j (LLM orchestration), Spring AI (provider abstraction)

# 💽 Data
PostgreSQL, pgvector (vector embeddings)

# 🖥️ DevOps & Tooling
Docker & Docker Compose, Postman (API testing), Git & GitHub

# 📁 System Architecture
<img width="960" height="570" alt="Screenshot 2025-12-30 at 10 30 07 AM" src="https://github.com/user-attachments/assets/c6d5b6a0-cdfb-4c98-9da0-1c97261e3023" />


