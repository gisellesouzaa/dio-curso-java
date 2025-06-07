
# 📘 Boas Práticas em Projetos API REST

Este documento apresenta um conjunto de boas práticas adotadas na construção de APIs RESTful. O objetivo é garantir um código limpo, manutenível, seguro e bem documentado.


## ✅ Boas Práticas Gerais

### 1. **Arquitetura em Camadas**
- Separação clara entre camadas: `Controller`, `Service`, `Repository`, `DTOs`, `Entities`.
- Facilita a manutenção, testes e evolução do sistema.

### 2. **Padrão REST**
- Uso correto dos verbos HTTP (`GET`, `POST`, `PUT`, `DELETE`).
- Respostas com códigos de status apropriados (`200 OK`, `201 Created`, `404 Not Found`, etc).
- URLs semânticas e orientadas a recursos (ex: `/api/users/{id}`).

### 3. **Tratamento Global de Exceções**
- Uso de `@RestControllerAdvice` para capturar e tratar exceções de forma centralizada.
- Retorno de mensagens amigáveis e status HTTP adequados.

### 4. **Validações com Bean Validation**
- Uso de anotações como `@NotNull`, `@Size`, `@Email`, etc.
- Validação automática de entradas com `@Valid` nos controllers.

### 5. **Testes**
- Testes unitários com JUnit e Mockito.
- Testes de integração com Spring Boot Test.
- Cobertura de testes para serviços e controladores.

### 6. **Segurança**
- Uso de Spring Security para autenticação/autorização.
- Proteção de endpoints sensíveis.
- Boas práticas com JWT, OAuth2, etc.

### 7. **Uso de DTOs**
- Uso de `DTOs` para evitar exposição direta de entidades.

### 8. **Paginação**
- Paginação e ordenação com `Pageable`.

### 9. **Logs**
- Logs com SLF4J + Logback.

### 10. **Versionamento de API**
- Versionamento de API (`/api/v1/...`).
