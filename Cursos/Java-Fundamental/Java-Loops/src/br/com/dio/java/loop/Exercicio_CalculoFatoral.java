package br.com.dio.java.loop;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Exercicio_CalculoFatoral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int count;
		int resultado = 0;

		System.out.println("Digite um número: ");

		numero = sc.nextInt();
		count = numero;

		for (; count > 1; --count) {
			resultado = numero * (count - 1) ;
			numero = resultado;
		}

		System.out.println(numero+"! = " + resultado);

	}

}
