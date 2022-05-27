# Simplicando Projetos Java :coffee:

<hr><br>

### Spring Framework

+ Por que Spring?
+ Beans
+ Debug do Código - Beans
+ Inversão de Controle (IoC)
+ Debug do Código - IoC
+ Injeção de Dependências (DI)
+ Debug DI



### Spring boot

+ O que é o Spring Boot?
+ Motivação do Spring Boot
+ Spring Initializr
+ Auto-Configuration

### Principais dependências e bibliotecas

+ Swagger 
+ Feign

<hr><br>

### Por que Spring?

O que é o Spring? 



Spring nada mais é que uma plataforma com diversos recursos para construção de aplicativos Java, facilitando assim o desenvolvimento em Java EE (Java Enterprise Edition) com módulos que facilitam a construção de softwares reduzindo o tempo de desenvolvimento.



[Spring.io](https://spring.io/projects)



### Beans

O que é o Beans?



Um beans se trata de um objeto que é instanciado, montado e gerenciado por um container do Spring através de Inversão de Controle (Ioc) e Injeção de Dependências (DI).



Cíclo de vida: 

+ Container Iniciado
+ Bean é Instanciado
+ Dependencias São injetadas
+ Chamada do método de inicialização
+ Bean é utilizado
+ Bean é Descartado



Configurações do Beans:

É possivel configurar um Bean de duas formas por arquivos XML ou através de anotações.



Em XML seria preciso definir a tag `<bean>` dentro de uma tag principal `<beans>`  passando o path da classe assim o Spring saberá quais classes gerenciar a criação de instâncias e a injeção de dependências.



+ BeanFactory fornece um mecanismo de configuração avançada capaz de gerenciar objetos de qualquer natureza.
+ ApplicationContext se baseia na BeanFactor (é uma subinterface) e adiciona outras funcionalidades, como integração mais fácil com os recursos AOP do Spring para manitpulação de recursos de mensagem (para uso na internacionalização), propagação de eventos e contextos específicos da camada de aplicativo, como WebApplicationContext para o uso em aplicativos da web.



### Inversão de Controle





### O que é o SpringBoot

O spring boot é uma extensão do spring, o que utiliza do Spring Framework para iniciar uma aplicação de forma simples e rápida, sem se preocupar com configurações complexas como por exemplo, o Tomcat.



Componentes básicos do Spring Boot:

+ Spring Boot Starter;
+ Spring Boot Auto-Configuration;
+ Spring Boot Actuator;



Em Resumo o Spring Boot é um template pré-configurado para o desenvolvimento e execução de aplicações baseadas no Spring.

Onde, temos uma arquitetura baseada no Spring Core, que traz os componentes-base do Spring, como Mecanismo de DI/IoC, a Spring Expression Language (SpEL) e alguns Módulos-base do Spring AOP (Módulo para implementação de programação orientada a aspectos no Spring).



+ Spring Boot permite adicionar a estrutura-base o que é chamado de módulo

+ Um módulo é na verdade uma biblioteca ou ferramenta do ecossistema Spring que pode ser adicionada a uma plicação Spring Convencional.

  

### Motivação do Spring Boot

Resumidamente o Spring Boot veio para facilitar a vida do desenvovledor java e melhorar a produtividade do desernvolvimento de softwares. O Spring Boot Facilita todo esse processo, fazendo com que o desenvolvedor se concentre mais na parte realmente importante que envolve as regras do negócio e código







### Spring Initializr

O Spring Initializr fornece uma API extensível para gerar projetos baseados em JVM (Java Virtual Machine) é onde podemos crair um projeto Spring Boot de forma rápida e fácil atravésdo site:



[Start](https://start.spring.io)





### Auto-Configuration

O Auto-configuration ou configuração automática do SpringBoot configura automaticamente a aplicação Spring com base nas dependencias JAR que adicionamos ao projeto.



Para habilitar o recurso existem a anotação

@EnableAutoConfiguration, mas essa não é usada porque está contida no @SpringBootApplication. A Anotação @SpringBootApplication é a combinação de três anotações.





<hr><br>

### Principais dependencias e bibliotecas

+ Swagger
+ Feign



Swagger: é um projeto open source com diversas ferramentas utilizadas para desenvolver APIs com a especificação OpenAPI Specification(OAS), uma especificação para descrever, produzir, consumir e visualizar serviços de uma API REST. Com o OAS você poderá descrever recursos, URIs, modelos de dados métodos HTTP aceitos e códigos de resposta.



Tudo isso facilita a vida dos desenvolvedores de diversas linguagens de programação na criação, teste, consumo e documentação APIs REST.



Feign: é um cliente de serviço web declarativo (cliente HTTP) desenvolvido pela NEtflix e um dos mais populares do Spring Cloud Component. Com ele é possível criar clientes API HTTP no java de forma mais simples para chamar/consumir os serviços REST, utilizando anotações.



Para usar o Feign, precisamos adicionar a dependencia Spring-cloud-starter-openfeign no arquivo pom.xml.



### Spring Boot Test



O Spring Boot facilita o desenvolvimento de testes de unidade e de integração com o Spring Boot Test, um recurso bastante utilizado no desenvolvimento de aplicações java para testar comportamentos do código e regras do negócio.



Para utilizarmos precisamos usar spring-boot-starter-test, que importa os módulois de teste Spring Boot, bem como o JUnit Jupiter, AssertJ, Hamcrest e várias outras bibliotecas úteis.



Em desenvolvimento de software, os erros podem aparecer em qualuqer etapa do ciclo de vida do projeto. COM isso, o teste de software se torna essencial e não pode ser visto como uma atividade opcicional, pois oferece os métodos e ferramentas necessárias para garantir a qualidade de qualquer desenvolvimento.



### Testes Unitários



Os testes unitários são a base da pirâmide de testes onde são realizados o maior número de testes ou deveria para garantir a fidelidade do código e regras do negócio.



