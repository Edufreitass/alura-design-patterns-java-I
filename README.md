# Design Patterns Java I: Boas práticas de programação

- Não repita código com Template Method

- Saiba da importancia de estudar os Padrões de projeto

- Resolva problemas de muito Ifs usando Strategy

- Adicione comportamentos ao seu objeto com Decorator

- Crie diferentes ações com Observer

- Use o Builder para criação de objetos complicados

## O que é um padrão de projeto (Design Patterns)?

Um padrão de projeto é uma solução elegante para um problema que é recorrente no dia-a-dia do desenvolvedor.

Ou seja, por mais que desenvolvamos projetos diferentes, muitos dos problemas se repetem. 
Padrões de projeto são soluções elegantes e flexíveis para esses problemas.

## O que é mais importante ao estudar um padrão de projeto?

Entender a motivação do padrão de projeto e qual problema ele resolve. 

O mais importante ao estudar padrões de projeto é entender qual a real motivação do padrão, e quando ele deve ser aplicado.

As implementações são menos importantes, pois eles podem variar. O importante é resolver o problema de maneira elegante, usando a ideia por trás do padrão como um guia na implementação. Uma afirmação muito comum sobre padrões de projeto é que **você os aplica mil vezes, e as mil vezes você termina com uma implementação diferente do mesmo padrão.**

## Strategy o tempo todo?

Depende do contexto: flexibilidade é bom, mas agrega complexidade ao código.

Depende do problema. Lembre-se que códigos simples são mais fáceis de manter sempre. Se você só tem uma estratégia, talvez faça mais sentido você não usar o Strategy, já que você estaria flexibilizando algo sem necessidade.

Mas, se é nítido que novas estratégias aparecerão, com certeza um Strategy é mais limpo do que um conjunto de ifs, conforme discutimos nesse capítulo.

Novamente, avalie o contexto e veja se o padrão de projeto vai trazer benefícios para aquele cenário.

## Quando usar o Strategy?

O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação. No exemplo do vídeo, temos diferentes maneiras de calcular o imposto, e precisamos alternar entre elas.

O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles. Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, e apenas mandam o algoritmo rodar. Isso faz com que o código da classe cliente fique bastante desacoplado das implementações concretas de algoritmos, possibilitando assim com que esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu código.

## Categorias dos padrões GoF

Os padrões GoF foram divididos e categorizados de acordo com a natureza do problema que eles resolvem.

**Padrões de Criação**: Tem como objetivo abstrair a instanciação de objetos. Com eles, o sistema vai solicitar um objeto de um determinado tipo e o terá prontinho, sob demanda, sem nem se preocupar com as nuances da criação. Fazendo um paralelo com o mundo real, uma empresa automobilística quando precisa de amortecedores, ela terceiriza (solicita-os) e então os instala em seus carros, sem se preocupar com o todo envolvido na criação desse componente.

**Padrões estruturais**: Os padrões dessa categoria se preocupam em melhor organizar a estrutura das classes e os relacionamentos entre classes e objetos.

**Padrões comportamentais**: Os padrões dessa categoria atuam diretamente na delegação de responsabilidades, definindo como os objetos devem se comportar e se comunicar.

## Padrões GoF (Gang of Four)

### Abaixo a relação dos 23 padrões GoF.

| **Nome do padrão** | 	**Categoria** |
| -------------- |:---------- |
| Abstract Factory | Criacional |
| Builder | Criacional |
| Factory Method | Criacional |
| Prototype | Criacional |
| Singleton | Criacional |
| Adapter | Estrutural |
| Bridge | Estrutural |
| Composite | Estrutural |
| Decorator | Estrutural |
| Facade | Estrutural |
| Flyweight | Estrutural |
| Proxy | Estrutural |
| Chain of Responsibility | Comportamental |
| Command | Comportamental |
| Interpreter | Comportamental |
| Iterator | Comportamental |
| Mediator | Comportamental |
| Memento | Comportamental |
| Observer | Comportamental |
| State | Comportamental |
| Strategy | Comportamental |
| Template Method | Comportamental |
| Visitor | Comportamental |

Fonte de algumas informações:
[Alura](https://cursos.alura.com.br/formacao-expert-em-orientacao-a-objetos) | 
[TreinaWeb](https://www.treinaweb.com.br/blog/padroes-de-projeto-o-que-sao-e-o-que-resolvem/)
