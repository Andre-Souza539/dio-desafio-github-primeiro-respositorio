# Instalação do JDK e IDE by André Souza :space_invader:



### Instalação do JDK

1. Acesse o [Link Direto](https://cdn.azul.com/zulu/bin/zulu11.56.19-ca-jdk11.0.15-win_x64.zip)
2. Extraia o Conteúdo da pasta em `C:\Program Files\Java`
3. Copie o endereço da pasta você acabou de baixar extrair
4. Abra `Painel de Controle > Sistema > Editar as Variáveis de Ambiente do Sistema`
5. Clique em `Novo`  em Nome da Variável você coloca `JAVA_HOME` e em Valor da variável você adiciona o caminho da pasta que você extraiu.
6. Clique em `Path > editar > novo` 
7. Cole o endereço da pasta bin dentro da pasta que você acabou de criar
8. Feche 
9. Abra o CMD  e digite `java --version` deve aparecer JAVA JDK e a versão que foi baixada

<hr>

### Instalação do IDE

1. Baixe o Instalador pelo [Link para Download do Eclipse](https://www.eclipse.org/downloads/)
2. Instale no padrão NNF (Next Next Finish)
3. Abra o Eclipse

<hr>



### Hello World em Java

1. Crie um arquivo com o bloco de notas e passe o seguinte código

   `public class PrimeiroPrograma {`

   ​	`public static void main(String args[]){`

   ​		`System.out.println("Hello World!");`

   ​	`}`

   `}`

2. Salve o  arquivo como o seguinte nome e extensão `PrimeiroPrograma.java`

3. Acesse via terminal a pasta em que o arquivo se encontra

4. utilize o comando `javac PrimeiroPrograma.java` se não aparecer nada no terminal ótimo!

5. para rodar o *bytecode* agora basta digitar `java PrimeiroPrograma`

6. Comemore :smile: 

<hr>

*YEAH PROGRAMMER* - Robert C. Martin
