package br.com.dio.metodos;

public class Metodos_01 {
	public static void main(String[] args) {
		
		int num1 = 9;
		int num2 = 3;
		
		System.out.println("Num1 + Num2: " + soma(num1,num2));
		System.out.println("Num1 - Num2: " + subtracao(num1,num2));
		System.out.println("Num1 * Num2: " + multiplicacao(num1,num2));
		System.out.println("Num1 / Num2: " + divisao(num1,num2));
		
	}

	private static double divisao(int num1, int num2) {
			return num1 / num2;
		
	}

	private static int multiplicacao(int num1, int num2) {
		return num1 * num2;
	}

	private static int soma(int num1, int num2) {
		return num1 + num2;
	}

	private static int subtracao(int num1, int num2) {
			return num1 - num2;
	}


}
