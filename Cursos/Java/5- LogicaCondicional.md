# Lógica Condicional e Controle de Fluxos em Java :coffee:

### By André Souza :space_invader:

<hr>

#### 1. Operadores relacionais

**O que são operadores relacionais?**

R- São símbolo especiais que são capazes de realizar comparações entre determinados operandos e, em seguida, retornar um resultado



**Tipos:** 

+ Similaridade: igual, diferente
+ Tamanho: maior, maior igual, menor, menor igual



**Utilizando Operadores Relacionais**

Similaridade 

+ Igualdade: determina se um operando é igual ao outro
+ Diferença: determina se um operando não é igual ao outro

Simbologia

+ `Igualdade: ==`
+ `Diferença: !=`



Tamanho

+ Maior: determina se um operando é maior do que outro
+ Maior Igual: determina se um operando é maior ou igual a outro
+ Menor: determina se um operando é menor do que outro
+ Menor Igual: determina se um operando é menor ou igual a outro

Simbologia 

+ `Maior: >`
+ `Maior Igual: >=`
+ `Menor: <`
+ `Menor Igual <=`



**Exemplos**

`int i1 = 10; int i2 =20; float f1 = 4.5f; float f2 = 3.5f; char c1 = 'x'; char c2 = 'y'; String s1 = "Fulano"; String s2 = "Fulano"; boolean b1 = true; boolean b2 = false;`



`i1 == i2, i1 != i2, i1 > i2, i1 <= i2`

`f1 == f2, f1 != f2, f1 >= f2, f1 < f2`

`c1 == c2, c1 != c2, c1 > c2, c1 <= c2`

`s1 == s2, s1 != s2, s1 >= s2, s1 < s2`

`b1 == b2, b1 != b2, b1 > b2, b1 <= i1` 

`l2 > f1`



**Exercício:**

Criar um simples projeto para realizar as comparações do estudo, além de utilizar os demais tipos de dados não apresentados.

[Link do Exercício](https://github.com/aljsjunca/dio-desafio-github-primeiro-respositorio/blob/main/Cursos/Java/Estudo-LogicaCondicional/src/br/com/dio/java/logica/LogicaRelacional.java)

<hr>
#### 2. Operadores Lógicos

**O que são Operadores Lógicos ?** 
R- São símbolos especiais que são capazes de realizar comparações lógicas entre operandos lógicos ou expressões e , em seguida, retornar um resultado;



**Tipos**

+ Conjunção
+ Disjunção
+ Disjunção exclusiva
+ Negação



**Como utilizar:**

**Conjunção**: Operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdade 

| O-E  | O-E  |  R   |
| :--: | :--: | :--: |
|  V   |  V   |  V   |
|  V   |  F   |  F   |
|  F   |  V   |  F   |
|  F   |  F   |  F   |

O - Operando 

E - Expressão 

R - Resultado



**Simbologia**

+ &&

**Terminologia**:

and(e)



**Disjunção:** Operação que só é falsa quando ambos os operandos ou expressões envolvidas são falsos



| O-E  | O-E  |  R   |
| :--: | :--: | :--: |
|  V   |  V   |  V   |
|  V   |  F   |  V   |
|  F   |  V   |  V   |
|  F   |  F   |  F   |



O - Operando 

E - Expressão 

R - Resultado



**Simbologia**

+ ||

**Terminologia**:

or(ou)



**Disjunção exclusiva:** Operação que só é verdadeira quando ambos os operadores ou expressões são opostos.



| O-E  | O-E  |  R   |
| :--: | :--: | :--: |
|  V   |  V   |  F   |
|  V   |  F   |  V   |
|  F   |  V   |  V   |
|  F   |  F   |  F   |



O - Operando 

E - Expressão 

R - Resultado



**Simbologia**

+ ^

**Terminologia**:

xor



**Negação:** Operação que inverte o valor lógico de um operando ou expressão.



| O-E  | O-E  |  R   |
| :--: | :--: | :--: |
|  V   |  V   |  F   |
|  V   |  F   |  V   |
|  F   |  V   |  V   |
|  F   |  F   |  F   |



O - Operando 

E - Expressão 

R - Resultado



**Simbologia**

+ !

**Terminologia**:

+ inversão



**Quando Utilizar?** 



**Curiosidades**

+ Operadores bitwise & e | // Não são operadores Lógicos
+ Operadores shift: ~, >>, >>>, << // Inverter os Bits dos números

 

**Exemplos:**



`boolean b1 = true; boolean b2 = false;`

`boolean b3 = true; boolean b4 = false;`



`b1 && b2;`

`b1 && b3;`



`b2 || b3;`

`b2 || b4;`



`b1 ^ b3;`

`b4 ^ b1;`



`!b1;`

`!b2;`



`(i1 > i2) || (f2 < f1)`

`((i1 + i2) < (f2 - f1)) && true`



**Boas práticas**

+ Crie variaveis auxiliares para guardar resultados intermediários 

`(salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)`

​	`pode ser`

`(salarioBaixo) && (muitosDependentes)`



`boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);`





<hr>

#### 3. Controle de Fluxo

<hr>

#### 4. Blocos

<hr>









