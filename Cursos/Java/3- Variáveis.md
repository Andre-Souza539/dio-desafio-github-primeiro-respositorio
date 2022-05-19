# Java - Variáveis by André Souza :space_invader:



#### Variáveis, Tipos de Dados e Operadores Aritméticos

<hr>



#### 1. Conceituação e Criação

**O que é uma Variável?**

R- Variável é um espaço na memória do computador, onde se pode guardar valores



**Existem 4 Tipos de variável em Java:**

- Instância: Objeto
- Classe: classe
- Local: dentro de método
- Parâmetro: Na assinatura do método



**Padrão de Definição**

`Visibilidade modificador tipo nome = valor inicial;`

+ Visibilidade: public, protected e private;
+ Modificador: static e final;
+ Tipo:  tipo de dado;
+ Nome: Nome da variável;
+ Valor Inicial: Valor para inicializar uma variável;



**Criação: Convenções e Regras**

+ Não devem começar com números;

+ Embora permitido, "$" e "_" devem ser evitados;

+ São case-sensitive;

+ Sem espaços;

+ Não podem ser as palavras reservadas do java:

  `abstract continue for new switch assert default goto package synchronized boolean do if private this break double case Implements throw protected byte else import public throws enum instanceof return transient catch extends int short try char final interface static void class finally long strictfp volatile const float native super while etc...`

  

**Exemplos: (*Negrito Informa um erro ou mal prática*)**

`int i`                                                  `int i`

`int I`                                                  `int asrn21231md;`

**`int 1a`**                                                **`int asrn246 78md;`**

`int _1a`                                              `int asrn$asdopk_md = 10;`

`int $aq`                                              **`int asrn$23%78_md = 10;`**

`int I = 10`

`int final j = 10;`



**Boas Práticas:**

+ Sempre Começar com letra minúscula
+ Nomes expressivos
+ Notação Camelo;
+ Quando constante(final) maiúscula e separada por "_";



**Exemplos: (*Negrito Informa um erro ou mal prática*)**  

`int quantidadedeProduto;`

**`int quantidadedeProduto;`**

`int final NUMERO_TENTATIVAS = 5;`

**`int final numeroTentativas = 5;`**

**`int NUMERO_TENTATIVAS = 5;`**

**`int qtdProd;`**

`int i;`



*"Usar boas práticas é para mostrar  que você se preocupa em criar um código fácil de manter e fácil de ler"*

<hr>

#### 2. Tipos de dado

**O que é um tipo de dado?**

R- São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.



**Tipificação:**

+ Estática(Forte) vs Dinâmica (Fraco)
+ Primitivo vs Composto



**Opções de Tipos:**

+ Textual
+ Numeral 
+ Lógico
+ Objeto



**Exemplos numeral:**

+ `byte: -128 até 127 => byte b = 15;`
+ `short: -32.768 até 32.767 => short s = - 15785;`
+ `int: -2.147.483.684 até 2.147.483.687 => int i = 8515785;`
+ `long: -9.223.372.036.854.775.808 até -9.223.372.036.854.775.807 => long l = 5938515785L;`
+ `Float: ± 3.40282347E+38F => float f = 3.14...(f);`
+ `Double ± 1.79769313486231570E+308 double d = 3.14...(d);`

**Exemplos textual**

+ `char: caracteres de 16-bit unicode => char c = '\u0084'; ou char c = 'T'`
+ `String: um tipo "especial" => String s = "Texto";`

**Exemplos Lógico:**

+ `boolean: true e false => boolean s = false`

**Utilização**

| Tipos de dado     | Valor Default |
| ----------------- | ------------- |
| byte              | 0             |
| short             | 0             |
| int               | 0             |
| long              | 0L            |
| float             | 0.0f          |
| double            | 0.0d          |
| char              | '\u0000'      |
| String(e Objetos) | null          |
| boolean           | false         |

**Boas práticas**

Usar de forma adequada cada tipo de dado para cada informação 



<hr>

#### 3. Operadores Aritméticos

<hr>

#### 4. Conversões(Casting)

<hr>



