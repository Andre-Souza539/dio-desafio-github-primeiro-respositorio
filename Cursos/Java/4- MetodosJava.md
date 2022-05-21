# Entendendo Métodos Java :coffee:

### By André Souza :space_invader:

<hr>

#### 1. Criação



**O que é um método?**

R- É uma porção de código (sub-rotina)  que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsável por definir e realizar um determinado comportamento. 



**Como definir e utilizar métodos**



**Criação**

`Visibilidade Tipo  Modificador retorno nome (Parâmetros) exceções {`

​	`Corpo`

`}`



**Onde:**

`V: public, protected ou private`

`T: Concreto ou abstrato`

`M: Static ou final`

`R: Tipo de dado ou Void`

`N: Nome fornecido ao método`

`P: Parâmetros que pode receber`

`E: Exceções que pode lançar`

`C; Código que possui ou vazio`



**Exemplos:**

`public String getNome(){...}`

`public double calcularTotalNota(){...}`

`public int verificarDistancia(int cordenada1, int cordenada2){...}`

`public abstract void executar();`

`public void alterarFabricante(Fabricante fabricante){...}`

`public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra> compras){...}`



**public static Retorno Nome(Parametro){....}** <= Modelo Padrão



**Utilização:**

Passa-se uma mensagem através de uma classe ou objeto.



`nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...);`

`nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...);`



**Exemplo:**



`Math.random(); ou Math.sqrt(4);`

`usuario.getEmail(); ou usuario.alterarEndereco(endereco);`



**Particularidades**

+ Assinatura: É a forma de identificar unicamente o método

  + Ass = nome + parâmetros

  Método:

  `public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)`

  `{...}`

  Assinatura:

  `calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)`

  

+ Construtor e Destrutor: São Métodos especiais usados na orientação a Objetos.



+ Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe



+ Passagem de parâmetros:

  + Por valor (cópia)

    ​		`int i = 10;`

    ​		`public void fazerAlgo(int i){`

    ​			`i = i + 10;`

    ​			`System.out.println("Valor de i dentro: " + i);`

    ​		`}`

    ​		`System.out.println("Valor de i fora: " + i)`

  + Por referência (endereço)



**Aplicar boas práticas**

+ Nomes devem ser descritivos, mas curtos
+ Notação camelo
  + `verificarSaldo(); executarTransferencia(...); existeDebito();`
+ Deve possuir entre 80 e 120 linhas
+ Evite lista de parâmetros longas
+ Visibilidades adequadas



## Exercícios:

**Crie uma aplicação que resolva as seguintes situações**

+ Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre com 2 valores devem ser passados
+ A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde, Boa noite
+ Calcule o valor final de um empréstimo, á partir do valor solicitado. Taxas e parcelas influenciam. Defina arbitrariamente as faixas que influenciam nos valores

**Observações**

+ Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
+ pode chamar um método dentro de outro
+ pode passar como parâmetro, a chamada de um outro método



[Resolução do Exercício](https://github.com/aljsjunca/dio-desafio-github-primeiro-respositorio/tree/main/Cursos/Java/Estudos-Metodos/src/br/com/dio/metodos)

<hr>

#### 2. Sobrecarga




**O que é sobrecarca?**

R- É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.



**Como criar uma sobrecarga?**

Alterar a assinatura do método: 

Ass = nome + parâmetros



`converter ParaInteiro(float f);`

`converterParaInteiro(double d);`

`converterParaInteiro(String s);`

`converterParaInteiro(float f, RoundType rd);```

`converterParaInteiro(double d, RoundType rd);`

`converterParaInteiro(String s, RoundType rd);`

**converterParaInteiro(RoundType rd, String s);**

**converterParaInteiro();**



> Tenha em mente = "Mudou a lista de parâmetros mas continuou com o mesmo nome, foi criada uma sobrecarga para o método"



[Exemplos de Sobrecarga](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)

| `void` | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println())**()Terminates the current line by writing the line separator string. |
| ------ | ------------------------------------------------------------ |
| `void` | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(boolean))**(boolean x)Prints a boolean and then terminate the line. |
| void   | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(char))**(char x)Prints a character and then terminate the line. |
| `void` | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(char[]))**(char[] x)Prints an array of characters and then terminate the line. |
| `void` | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(double))**(double x)Prints a double and then terminate the line. |
| void   | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(float))**(float x)Prints a float and then terminate the line. |
| `void` | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(int))**(int x)Prints an integer and then terminate the line. |
| void   | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(long))**(long x)Prints a long and then terminate the line. |
| `void` | **[println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(java.lang.Object))**(Object x)Prints an Object and then terminate the line. |
| `void` | **[ println](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(java.lang.String))**(String x) Prints a String and then terminate the line. |



[Sobrecarga na String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(boolean))**(boolean b)Returns the string representation of the boolean argument. |
| --------------- | ------------------------------------------------------------ |
| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(char))**(char c)Returns the string representation of the char argument. |
| static String   | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(char[]))**(char[] data)Returns the string representation of the char array argument. |
| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(char[], int, int))**(char[] data, int offset, int count)Returns the string representation of a specific subarray of the char array argument. |
| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(double))**(double d)Returns the string representation of the double argument. |
| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(float))**(float f)Returns the string representation of the float argument. |
| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(int))**(int i)Returns the string representation of the int argument. |
| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(long))**(long l)Returns the string representation of the long argument. |
| `static String` | **[valueOf](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#valueOf(java.lang.Object))**(Object obj)Returns the string representation of the Object argument. |



**Curiosidade: Sobrecarga x Sobrescrita**

**Exercício:** 

+ Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis : quadrado, retângulo, losango e trapézio.

[Resolução do Exercício](https://github.com/aljsjunca/dio-desafio-github-primeiro-respositorio/tree/main/Cursos/Java/Estudo-Metodo-2/src/br/com/dio/metodo/sobrecarga)



<hr>
#### 3. Retornos



**Como funciona? **

O método executa o seu retorno quando:

+ Completa todas suas instruções internas
+ Chega a uma declaração explicita de retorno
+ Lança uma exceção



**Considerações:**

+ O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
+ O tipo de dado do return deve ser compatível com o dométodo;
+ Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução



Exemplos:

`public String getMensagem(){`

​	`return "Ola!";`

`}`



`public double getJuros(){`

​	`return 2.36;`

`}`



`public int getParcelas(){`

​	`return 1.36f;` // Erro pois o método foi declarado com o retorno inteiro.

}`



`public void setIdade(){`

​	`return 10;` // erro pois o método foi declarado como void (ou seja sem retorno)

`}`



`public void executar() {`

`...`

`return;`

`...`

`}`



**Exercício:**

Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça os métodos retornarem os valores;





<hr>




