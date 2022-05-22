package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Digite o Primeiro Número: ");
		a = scan.nextInt();
		System.out.println("Digite o Segundo Número: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int sub = sub(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println(divisao);
		System.out.println(multiplicacao);
			
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
