# POO - Java :coffee: by André Souza :space_invader: 

<hr><br>

## O que é Orientação a Objeto

R- A orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software baseados na composição e interação entre diversas unidades de software chamadas de objetos.



# Por que usar? 

POO vs Programação Estruturada

+ Estruturado: Tem uma representação mais simplista, Foca em operações(funções) e dados, foca mais no "Como Fazer"
+ Orientado a Objeto: tem uma representação mais realista, foca na modelagem de entidades e nas interações entre elas. Foca mais no "O que fazer"



**Vantagens da POO**

+ Melhor coesão (Responsabilidades bem Definidas)
+ Melhor acoplamento (Flexibilidade)
+ Diminuição do Gap semântico (Diferença de Representação)
+ Coletor de lixo (Redução da memória utilizada)





# Fundamentos



### Pilares da Orientação ao Objeto

+ Abstração: Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objeto.

+ Reuso: Capacidade de criar novas unidades de código a partir de outras já existentes.

+ Encapsulamento: Capacidade de esconder complexidades e proteger dados.

  



# Estrutura Básica da OO

+ Classe: É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe deine o comportamente de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.

  **Exemplos de classe:**

  Bola, Carro, Venda, Viagem, Computador.

  **Dicas:**

  - Substantivos
  - Nomes Significativos
  - Contexto deve ser considerado

  

  **Código Em Java**

  `class Carro {}`

  

  + Atributo: É o elemento de uma classe responsável por definir sua estrutura de dados. o conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe.

    **Exemplo:**

    Bola 

    + Diametro

    Carro

    + Cor

    Viagem

    + Distancia

    Computador

    + Memoria

    Venda

    + Valor

    Comprador

    + Nome

    

    **Atributo x Variável**

    

    Atributo: O que é próprio e peculiar a alguém ou a alguma coisa.

    Variável: Sujeito a variações ou mudanças; que pode variar; inconstante, instável.

    

    **Dicas:**

    + Substantivos e Adjetivos
    + Nomes Significativos
    + Contexto deve ser considerado
    + Abstração
    + Tipos Adequados

    

    **Código em Java:**

    `class Carro { int portas; }`



+ Método: É uma porção de código (Sub-rotina) que é disponibilizada pela classe. Este é Eexecutado quando é feita uma requisição a ele. um Método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento

  

  **Exemplos:**

  Carro: Ligar

  Computador: desligar.

  Venda: Calcular total.

  Comprador: realizar troca.

  

  **Criação:**

  + Visibilidade
  + Retorno
  + Nome
  + Parâmetros

  

  **Dicas:**

  + Verbos
  + Nome Significativos
  + Contexto devem ser considerado

  

  **Codigos:**

  `Class Carro { void Frear(); }`

  

  **Métodos Especiais:**

  + Construtor
  + Destrutor

  **Sobrecarga:**

  + Mudar a assinatura de acordo com a necessidade
    + Assinatura: Nome + Parâmetros
    + **Exemplo:** 
      + m1();
      + m1(int i );
      + m1(float f);
      + m1(String s, long l);
    + **Por que usar?**

  

+ Objeto: É a representação de um conceito/entidade do mundo real que pode ser física ou conceitual e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos:

  **Criação**

  `Carro carro = new Carro();`



+ Mensagem: É o processo de ativação de um método de objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja um método estático

  **chamada:**

  `Carro.<método>;`





## As relações: Herança, Associação e Interface



#### Relações;

+ Herança: É o relacionamento entre classes em que uma classe chamada de subclasse é a uma extensão, subtipo, de outra classe chamada de superclasse. Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.

  **Código**

  `class A extends B {}`

  **Tipos de Herança**

  + Simples: A Classe filha tem só uma classe mãe 
  + Múltipla: A Classe filha tem duas ou mais Classes mães (Não há em Java)

  **Upcast:**

  **Downcast**

  

  **Polimorfismo:**

  + "A mesma ação, se comportando diferente"

  **Sobrescrita**

  + "A mesma ação podendo se comportar diferente"

​	

+ **Associação**
+ **Interface**



## A Organização de Pacotes e Visibilidades



