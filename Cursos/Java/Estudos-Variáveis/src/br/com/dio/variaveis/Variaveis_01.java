package br.com.dio.variaveis;

public class Variaveis_01 {
	public static void main(String[] args) {

		/**
		 * Declaração das Variáveis
		 */

		int i;
		// int i;// Erro pois há uma variável com o mesmo nome
		int I;
		int _1a; // Embora que permitido deve ser evitado iniciar variáveis
		int $aq; // com $ ou _

		/**
		 * Inicialização das Variáveis
		 */

		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;

		/**
		 * Declaração com inicialização
		 */

		final int j = 10; // Constante
		// j = 15; // Constantes não podem ser alteradas
		int asrn24678md = 100; // válida porem não usual
		// int asrn246 78md = 200; // Contém espaço na variável
		int asrn2$4678_md = 10; // nome válido porém não boa prática
		// int asrn2$46%78_md = 10; // Não podemos utilizar o % de jeito algum

		/**
		 * Regra da Expressividade
		 */

		int quantidadeProduto = 50;
		// int QuantidadeProduto; // Não segue a Notação Camelo
		final int NUMERO_TENTATIIVAS = 5;
		// final int numeroTentativas = 5; // Constantes não devem seguir a Notação
		// camelo
		int QUANTIDADE_OPCOES = 25;//
		// int qtdProd; // Não é uma variável Expressiva

		/**
		 * Exibição no Console das variáveis
		 */

		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);

		System.out.println(j);
		System.out.println(asrn24678md);
		System.out.println(asrn2$4678_md);

		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIIVAS);
		System.out.println(QUANTIDADE_OPCOES);

	}
}
