
# 📄 Soluções Adotadas neste Projeto

Este documento apresenta as soluções específicas adotadas neste projeto de API REST com Java e Spring Boot.

## 🧱 Injeção de Dependência via Construtor

### Por que usar?
- Garante imutabilidade das dependências.
- Facilita testes unitários (injeção de mocks).
- Torna as dependências explícitas e obrigatórias.

## 📄 Documentação da API com Swagger (OpenAPI)

### Ferramenta utilizada:
- **Springdoc OpenAPI** (`springdoc-openapi-ui`)

### Benefícios:
- Geração automática da documentação da API.
- Interface interativa para testar endpoints.
- Facilita a integração com front-end e outros sistemas.

## 🧪 Uso de Interfaces para Serviços com Implementação Separada

### Benefícios:
- Facilita a substituição de implementações.
- Promove a programação orientada a interfaces.
- Melhora a testabilidade e manutenção do código.
- Protege a implementação das regras de negócios

## 📄 Outras Soluções Adotadas

### 1. **Tratamento Global de Exceções**
- Uso de `@RestControllerAdvice` para capturar e tratar exceções de forma centralizada.

### 2. **Versionamento de API**
- Versionamento de API (`/api/v1/...`).

### OUTRAS INFOS:

Aos interessados no desenvolvimento da tela inicial do App do Santander (Figma) em Angular, Android, iOS ou Flutter... Caso a URL produtiva não esteja mais disponível, deixamos um Backup no GitHub Pages, é só dar um GET lá 😘
- URL de Produção: https://sdw-2023-prd.up.railway.app/users/1
- Mock (Backup): https://digitalinnovationone.github.io/santander-dev-week-2023-api/mocks/find_one.json
