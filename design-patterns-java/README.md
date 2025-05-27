# Design Patterns
Design Patterns são soluções reutilizáveis para problemas comuns no desenvolvimento de software. Eles não são pedaços de código prontos, mas sim estratégias testadas para resolver desafios recorrentes de design de software.

Os padrões ajudam a tornar o código mais modular, reutilizável, legível e fácil de manter. Eles são divididos em três grandes categorias:

1. **Padrões Criacionais** – tratam da criação de objetos.
2. **Padrões Estruturais** – tratam da composição de classes e objetos.
3. **Padrões Comportamentais** – tratam da comunicação entre objetos.

## Tabela Comparativa dos Principais Design Patterns

| Tipo               | Padrão                  | Propósito Principal                                                                 | Exemplo em Java                                      | Exemplo em Spring Framework                          |
|--------------------|--------------------------|--------------------------------------------------------------------------------------|------------------------------------------------------|------------------------------------------------------|
| **Criacional**     | Singleton                | Garante que uma classe tenha apenas uma instância.                                  | `Runtime.getRuntime()`                               | Beans Spring são Singleton por padrão (`@Component`) |
|                    | Factory Method           | Cria objetos sem expor a lógica de criação ao cliente.                              | `Calendar.getInstance()`                             | `BeanFactory` ou `@Bean` em métodos de configuração  |
|                    | Abstract Factory         | Cria famílias de objetos relacionados.                                              | `DocumentBuilderFactory.newInstance()`               | `ApplicationContext` gerencia múltiplos beans        |
|                    | Builder                  | Constrói objetos complexos passo a passo.                                           | `StringBuilder`                                      | `RestTemplateBuilder`, `WebClient.Builder`           |
|                    | Prototype                | Clona objetos existentes.                                                           | `Object.clone()`                                     | Beans com escopo `@Scope("prototype")`               |
| **Estrutural**     | Adapter                  | Converte a interface de uma classe em outra esperada.                               | `Arrays.asList()`                                    | `AdapterPattern` em `Spring MVC` (ex: `HandlerAdapter`) |
|                    | Decorator                | Adiciona responsabilidades a objetos dinamicamente.                                 | `BufferedReader` envolvendo `FileReader`             | `BeanPostProcessor`, `@Transactional`, `AOP`         |
|                    | Composite                | Compõe objetos em estruturas de árvore.                                             | `JComponent`                                         | `CompositeViewResolver`, `CompositeItemWriter`       |
|                    | Proxy                    | Representa outro objeto para controlar o acesso.                                    | `Proxy.newProxyInstance()`                           | `@Transactional`, `@Async`, `AOP`                    |
|                    | Facade                   | Fornece uma interface simplificada para um subsistema complexo.                     | `FacesContext`                                       | `JdbcTemplate`, `RestTemplate`                       |
| **Comportamental** | Observer                 | Permite que objetos sejam notificados sobre mudanças em outros objetos.             | `Observable` (obsoleto)                              | `ApplicationEventPublisher`, `@EventListener`        |
|                    | Strategy                 | Permite selecionar algoritmos em tempo de execução.                                 | `Comparator`                                         | `Spring Security` com `AuthenticationProvider`       |
|                    | Command                  | Encapsula uma solicitação como um objeto.                                           | `Runnable`                                           | `@Scheduled`, `CommandLineRunner`                    |
|                    | Template Method          | Define o esqueleto de um algoritmo, deixando alguns passos para subclasses.         | `AbstractList`                                       | `JdbcTemplate`, `RestTemplate`                       |
|                    | State                    | Permite que um objeto altere seu comportamento quando seu estado interno muda.      | `Lifecycle`                                          | `StateMachine` do Spring Statemachine                |

---


## Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto.
Especificamente, este projeto explorou alguns padrões usando Java Puro:
- Singleton
- Strategy
- Facade
