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

## Strategy o tempo todo?

Depende do contexto: flexibilidade é bom, mas agrega complexidade ao código.

Depende do problema. Lembre-se que códigos simples são mais fáceis de manter sempre. Se você só tem uma estratégia, talvez faça mais sentido você não usar o Strategy, já que você estaria flexibilizando algo sem necessidade.

Mas, se é nítido que novas estratégias aparecerão, com certeza um Strategy é mais limpo do que um conjunto de ifs, conforme discutimos nesse capítulo.

Novamente, avalie o contexto e veja se o padrão de projeto vai trazer benefícios para aquele cenário.

## Quando usar o Strategy?

O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação. No exemplo do vídeo, temos diferentes maneiras de calcular o imposto, e precisamos alternar entre elas.

O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles. Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, e apenas mandam o algoritmo rodar. Isso faz com que o código da classe cliente fique bastante desacoplado das implementações concretas de algoritmos, possibilitando assim com que esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu código.

## Quando usar o Chain of Responsibility?

O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.

Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

## Chain of Responsibility e Template Method

Será que podemos misturar os padrões de projeto? No capítulo anterior, será que o Template Method poderia ser usado em conjunto com o Chain of Responsibility? Como?

Claro que podemos! Você deve se lembrar que no capítulo anterior implementamos uma verificação em todos os nós da corrente: caso tenha um próximo item na corrente, ele repassa; caso contrário, para a corrente.

Perceba que todas as correntes seguem um mesmo padrão: todas elas verificam se devem trabalhar, verificando uma condição qualquer; em caso positivo, fazem o seu trabalho. Em caso negativo, a corrente verifica se existe um próximo nó a ser invocado. Se existe, passa para ele. Se não existe, lança uma exceção.

Implementar um Template Method ali poderia fazer com que o programador escrevesse menos código em todos os nós da corrente, facilitando as novas implementações.

## Quando usar o Template Method?

Quando devemos aplicar o padrão Template Method? No código que você já escreveu na tua vida profissional, onde poderia ter aplicado ele?

Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução. Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos", que serão implementados de maneira diferente por cada uma das implementações específicas.

Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.

## Quando usar o Decorator?

Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia, como foi o caso dos impostos, que podem ser composto por outros impostos. O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da instanciação, quais instancias serão utilizadas para realizar o trabalho.

## Quando usar o State?

A principal situação que faz emergir o Design Pattern State é a necessidade de implementação de uma máquina de estados. Geralmente, o controle das possíveis transições são vários e complexos, fazendo com que a implementação não seja simples. O State auxilia a manter o controle dos estados simples e organizados através da criação de classes que representem cada estado e saiba controlar as transições.

## Quando usar o Builder?

Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.

Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e fácil de ser usada.

## Builders ou construtores?

Por que não usar, ao invés do Builder, um conjunto de construtores nesse objeto, que fariam a mesma coisa que o Builder? Discuta vantagens e desvantagens de se usar diversos construtores ao invés do Builder.

Um dos problemas da utilização de construtores é que, em casos onde diversos atributos sejam opcionais, precisaríamos ter uma combinação gigante de construtores (uma para cada possível combinação de atributos obrigatórios e opcionais), tornando o código difícil de manter. Além disso, como construir esse objeto é complicado, colocar essa regra no construtor do objeto, só faz com que ele tenha agora mais uma responsabilidade.

Em outros casos, poderíamos ter diversos if's dentro do construtor. Quanto mais complexo for o processo de criação da classe, mais você deve pensar em isolá-lo em uma classe específica.

O Builder possibilita a separação da complexidade da criação desse objeto em uma classe específica para isso, além de possibilitar a implementação de atributos opcionais mais facilmente.

## Swing e Observer

Ao desenvolver em Swing, o programador acostuma-se com o seguinte trecho de código, que será executado quando o usuário clicar em um botão:

```java
class CliqueDoBotao implements ActionListener {
      public void actionPerformed(ActionEvent ae) {
        System.out.println("botao clicado");
      }
    }

class ProgramaEmSwing {
  public void desenhaTela() {
    // ...

   botao.addActionListener(new CliqueDoBotao());
  }
}
```

Veja que, no fundo, o que estamos fazendo é passando um observer (no caso, o CliqueDoBotao) para o botão. O botão, por sua vez, ao perceber que foi clicado, invoca todas as ações registradas até então.

Muitas APIs simulam programação orientada a eventos por meio da implementação de Observers.

## Quando usar o Observer?

Quando o acoplamento da nossa classe está crescendo, ou quando temos diversas ações diferentes a serem executadas após um determinado processo, podemos implementar o Observer.

Ele permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.

## Qual é o padrão para o problema dos Vários Filtros?

Imagine que estamos implementando uma sequência de filtros. Esses filtros precisam eliminar diversas faturas de uma lista, de acordo com algumas regras de negócio: faturas menores que 2000 devem ser eliminadas, faturas maiores do que 8000 devem ser eliminadas, faturas entre 3000 e 4500 que foram emitidas no estado de São Paulo devem ser eliminadas, e assim por diante.

Uma implementação procedural produziria uma sequência de ifs enorme para verificar todas essas condições.

Dentre os padrões de projeto aqui aprendidos, qual se encaixa melhor para esse problema?

**Decorator ou Chain of Responsibility**

O Decorator se encaixaria bem nesse problema. Poderíamos fazer com que cada filtro seja um "Decorator", e vamos decorando a lista com todos os filtros existentes. Cada filtro teria sua própria classe, simples e fácil de ser compreendida e mantida.

O Chain of Responsibility poderia ser uma alternativa também. Mas idealmente, em um "chain", assim que encontra-se um nó da corrente que atende aquele problema, os outros não são executados. Uma comum implementação do padrão são filtros, iguais os usados em aplicações web Java e etc, e neles os filtros se combinam e muitos podem ser executados ao mesmo tempo.

Ambas as respostas caem bem.

Os outros padrões não fazem sentido para o problema dado. State serve para gerenciar estados de um objeto; builder para criar objetos complexos, e strategy para possibilitar a flexibilização de um algoritmo, trocando partes do mesmo.

## Qual é o padrão para o problema da Notificação de Sistemas Externos?

**Observer**

O Observer se encaixaria muito bem. Ele permite que você notifique e execute ações após algum acontecimento no seu sistema. E faz isso de tal forma que o acoplamento entre classes continue baixo, e flexível para adicionar novas ações quando necessário.

## Qual é o padrão para o problema dos Algoritmos Similares?

Imagine que temos uma série de algoritmos matemáticos a serem implementados. Todos eles são bem parecidos, possuem a mesma estrutura. As variações são mínimas, por exemplo, um deles deve iterar até o fim da lista, enquanto o outro deve iterar até a metade dela.

Uma implementação procedural possuíria uma alta repetição de código, já que os algoritmos são muito parecidos.

Dentre os padrões de projeto aqui aprendidos, qual se encaixa melhor para esse problema?

**Template Method**

O Template Method cairia como uma luva, já que ele possibilita que o desenvolvedor escreva a "estrutura" do algoritmo apenas uma vez, e a reutilize nas implementações específicas de cada um dos algoritmos.

Isso faz com o que o código fique mais simples, possibilita que mudanças na estrutura desses algoritmos sejam facilmente modificadas, e que novos algoritmos sejam criados de forma simples.

## Qual é o padrão para o problema do Contrato?

Um Contrato pode sofrer tipos de alterações, descontos, ajustes enquanto está EM ANDAMENTO. O mesmo pode acontecer quando ele está FALTANDO ASSINATURA DO CLIENTE. Mas, após ASSINADO, o contrato não pode mais sofrer alterações.

Um código procedural muito provavelmente conteria um conjunto enorme de ifs, um para cada possível estado do Contrato e ação a ser executada, tornando o código desnecessariamente complexo e difícil de ser mantido.

Dentre os padrões de projeto aqui aprendidos, qual se encaixa melhor para esse problema?

**State**

O State facilitaria o trabalho do desenvolvedor, já que ele possibilitaria que as ações de cada estado fiquem centralizadas em classes específicas, evitando a possível bagunça de um código procedural cheio de ifs.

Além disso, criar novos estados para esse contrato também seria fácil.

## Padrões de Projeto

*Quais os benefícios que padrões de projeto trazem a um sistema OO?*

Padrões de projeto são alternativas para que o desenvolvedor consiga escrever código com responsabilidades mais bem definidas, com um baixo acoplamento, e que evolua de maneira natural. Características essas que não são encontrados em sistemas procedurais, que tipicamente apresentam código complexo, cheio de ifs, e que fazem muita coisa, tornando a manutenção custosa.

Códigos que fazem bom uso de OO evoluem geralmente não pela adição de mais um if, mas sim pela criação de mais uma estratégia, mais um observador, mais um estado, e assim por diante.

Padrões de projeto no fim apenas fazem bom uso da orientação a objetos, e seus conceitos e mecânismos, como encapsulamento, abstrações, interfaces, polimorfismo, e etc.

## O que voce pensa sobre Padroes de Projeto?

*Muitos desenvolvedores tentam forçar ao máximo o uso de padrões nos códigos. O que você pensa sobre isso? Usar padrões 100% do tempo é o ideal? Quais são as vantagens e desvantagens?*

Não. Padrões de projeto trazem grande flexibilidade ao seu código, mas isso tem um preço: complexidade. Naturalmente um código que faz uso de padrões de projeto é, do ponto de vista de implementação, mais complexo do que um código que não os utiliza. Afinal, como tudo está desacoplado, o desenvolvedor precisa entender melhor a solução para entender o que o código faz como um todo.

Um bom desenvolvedor sabe fazer essa avaliação e entender quais os ganhos e perdas da utilização de um padrão. Em um problema simples de resolver, talvez o uso de um padrão de projeto não faça sentido; o código vai apenas ficar mais complicado. Agora, em problemas que são por natureza complexos, ou que demandam flexibilidade, pois mudam o tempo todo, talvez a utilização de um padrão de projeto traga benefícios, já que todos os padrões sempre agregam flexibilidade ao código gerado.

Nunca se esqueça: a sua experiência é fundamental! Padrões de projeto são mais uma ferramenta. Eles devem ser um meio para se chegar à solução final, e não o "fim", ou seja, o seu objetivo principal.

Fonte de algumas informações:
[Alura](https://cursos.alura.com.br/formacao-expert-em-orientacao-a-objetos) | 
[TreinaWeb](https://www.treinaweb.com.br/blog/padroes-de-projeto-o-que-sao-e-o-que-resolvem/)
