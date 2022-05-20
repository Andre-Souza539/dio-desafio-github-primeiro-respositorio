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



<hr>

#### 2. Sobrecarga

<hr>

#### 3. Retornos

<hr>





