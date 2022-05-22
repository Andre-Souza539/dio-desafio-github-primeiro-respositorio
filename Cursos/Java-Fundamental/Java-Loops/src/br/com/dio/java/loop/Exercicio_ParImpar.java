package br.com.dio.java.loop;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exercicio_ParImpar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros = 0;
		int numero;
		int qtdPares = 0, qtdImpar = 0;
		int count = 0;
		
		System.out.println("Quantos Números?: ");
		qtdNumeros = sc.nextInt();
		
		do {
			System.out.println("Digite o " + (count + 1) + "º Numero: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) 
				qtdPares++;
			else qtdImpar++;
			
			count++;
			
		} while (count < qtdNumeros);
		
		System.out.println("Quantidade Par: " + qtdPares);
		System.out.println("Quantidade Impar: " + qtdImpar);
		
		
		
		
	}

}
