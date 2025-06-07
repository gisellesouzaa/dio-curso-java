# REST x RESTful

Este arquivo Readme.md fornece uma visão geral dos princípios REST e RESTful, regras para APIs e a modelagem que deve ser seguida no projeto de API REST em Java. Siga estas diretrizes para garantir que sua API seja projetada corretamente e adere às melhores práticas.


## O que é uma API REST?
Uma API REST (Representational State Transfer) é um estilo arquitetônico para projetar aplicações em rede. Ela se baseia em um protocolo de comunicação sem estado, cliente-servidor e cacheável -- mais comumente, HTTP. As APIs REST são projetadas para serem simples, escaláveis e fáceis de usar.

## O que é RESTful?
RESTful refere-se a serviços web que aderem aos princípios da arquitetura REST. Uma API RESTful é uma API que segue as restrições da arquitetura REST, proporcionando interoperabilidade entre sistemas de computador na internet.

## Regras para uma API ser considerada REST
1. **Arquitetura Cliente-Servidor**: O cliente e o servidor devem ser separados e se comunicar via HTTP.
2. **Sem Estado**: Cada solicitação do cliente para o servidor deve conter todas as informações necessárias para entender e processar a solicitação. O servidor não deve armazenar nenhum contexto do cliente entre as solicitações.
3. **Cacheabilidade**: As respostas devem ser definidas como cacheáveis ou não-cacheáveis para evitar que os clientes reutilizem dados desatualizados ou inadequados.
4. **Sistema em Camadas**: A API deve ser projetada em camadas, com cada camada tendo uma funcionalidade específica.
5. **Interface Uniforme**: A API deve ter uma interface consistente e uniforme, tornando-a fácil de usar e entender.

## Regras para uma API ser considerada RESTful
1. **Identificação de Recursos**: Os recursos devem ser identificados usando URIs.
2. **Manipulação de Recursos**: Os recursos devem ser manipulados usando métodos HTTP padrão (GET, POST, PUT, DELETE).
3. **Mensagens Auto-Descritivas**: Cada mensagem deve incluir informações suficientes para descrever como processar a mensagem.
4. **HATEOAS (Hypermedia as the Engine of Application State)**: Os clientes interagem com a aplicação inteiramente através de hipermídia fornecida dinamicamente pelos servidores de aplicação.

## Modelagem da API
Abaixo está a tabela para a modelagem que deve ser seguida na API:

| Recurso   | Método HTTP | URI                   | Descrição                          |
|-----------|--------------|-----------------------|------------------------------------|
| User      | GET          | /users                | Recuperar uma lista de usuários    |
| User      | POST         | /users                | Criar um novo usuário              |
| User      | GET          | /users/{id}           | Recuperar um usuário específico por ID |
| User      | PUT          | /users/{id}           | Atualizar um usuário específico por ID |
| User      | DELETE       | /users/{id}           | Excluir um usuário específico por ID |
| Product   | GET          | /products             | Recuperar uma lista de produtos    |
| Product   | POST         | /products             | Criar um novo produto              |
| Product   | GET          | /products/{id}        | Recuperar um produto específico por ID |
| Product   | PUT          | /products/{id}        | Atualizar um produto específico por ID |
| Product   | DELETE       | /products/{id}        | Excluir um produto específico por ID |

