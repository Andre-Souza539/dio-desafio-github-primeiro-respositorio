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



**O Que são Operadores?:**

R- São símbolos especiais que são capazes de realizar ações específicas em um, dois ou mais operandos e, em seguida retornar um resultado.



**Tipos:**

+ `Pós-fixado: exp ++ ou exp--`
+ `prefixado: ++exp ou --exp`
+ `Aritmético: +, -, *, / e %`
+ `Atribuição: =, +=, -=, *=, /= e %=`



**Exemplos:**

+ `int i = ++k; => i = k + 1` 
+ `int j  = k--; => j = k; k = k - 1` 
+ `float f = 1.5f + 4.5f;`
+ `long l = 10398L * 5L;`
+ `double d = 45d / 4d;`
+ `int k = 15% 4;`
+ `double d = f;` 
+ `i += 5; => i = i +5;`
+ `j -= 3; => j = j - 3;`
+ `d /= 2.7d; => d = d / 2.7d;`
+ `l *=3; => l = l * 3;`
+ k %=2; => k = k % 2;



| Operador       | Precedência           |
| -------------- | --------------------- |
| Pós-fixado     | exp++, exp--          |
| Prefixado      | ++exp, --exp          |
| Multiplicativo | *, /, %               |
| Aditivo        | +, -                  |
| Atribuição     | =, +=, -=, *=, /=, %= |

<hr>
#### 4. Conversões(Casting)



**O que é Casting?**

R- É a transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa



**Tipos**

+ Upcast(implícito)
+ Downcast(explícito)



**Utilização:**

U - I: Upcast Implícito 

D - E: Downcast Explícito

| xx         | byte  | short | char  |  int  | long  | float | double |
| :--------- | :---: | :---: | :---: | :---: | :---: | :---: | :----: |
| **byte**   |  xx   | U - I | char  | U - I | U - I | U - I | U - I  |
| **short**  | D - E |  xx   | char  | U - I | U - I | U - I | U - I  |
| **char**   | D - E | D - E |  xx   | U - I | U - I | U - I | U - I  |
| **int**    | D - E | D - E | D - E |  xx   | U - I | U - I | U - I  |
| **long**   | D - E | D - E | D - E | D - E |  xx   | U - I | U - I  |
| **float**  | D - E | D - E | D - E | D - E | D - E |  xx   | U - I  |
| **double** | D - E | D - E | D - E | D - E | D - E | D - E |   xx   |



**Exemplos:**

+ `long l; int i = 10; i = j;`
+ `int i; long l = 100; i = (int) l;`
+ `double d; float f = 10.5f; d = f;`
+ `float f; double d = 10.5d; f = float (float) d`

+ `int i; float f = 10.5f; **i = (int) f**;`

<hr>


