package br.com.dio.java.loop;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Exercicio_MaiorMedia {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1; 
		int numero;
		int maiorNumero = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite o " + i + "º Numero: ");
			numero = sc.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			soma += numero;
			++i;
			
		} while (i <= 5);

		int media = soma / 5;
		System.out.println("O Maior número foi: " + maiorNumero);
		System.out.println("A média foi: " + media);
		
		
		
	}
	
}
