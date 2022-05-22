package br.com.dio.java.logica;

public class ControleFluxo {

	public static void main(String[] args) {

		int idade = 23;
		double salario = 5000;
		boolean temFilhos = false;
		boolean casado = true;
		int mes = 6;
		int numero = 4;
		String dia = "Domingo";

		if (idade >= 18) {
			System.out.println("Você já pode tirar CNH: ");
		}

		if (mes == 6 || mes == 12 || mes == 1)
			System.out.println("Férias");

		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Mês inválido");
		}

		switch (dia) {

		case "Domingo":
			System.out.println("dia 1");
			break;
		case "Segunda":
			System.out.println("dia 2");
			break;
		case "Terça":
			System.out.println("dia 3");
			break;
		case "Quarta":
			System.out.println("dia 4");
			break;
		case "Quinta":
			System.out.println("dia 5");
			break;
		case "Sexta":
			System.out.println("dia 6");
			break;
		case "Sabado":
			System.out.println("dia 7");
			break;
		}

		switch (numero) {

		case 1:
			System.out.println("Certo");
			break;
		case 2:
			System.out.println("Certo");
			break;
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		case 5:
			System.out.println("Talvez");
			break;
		default:
			System.out.println("Inválido");
			break;
		}

	}

}
