package br.com.dio.java.loop;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Exercicio_NomeIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {
			System.out.println("Nome: ");
			nome = sc.next();
			if (nome.equals("0"))
				break;
			else {
				System.out.println("O nome digitado foi: " + nome);
			}
			
			System.out.println("Idade: ");
			idade = sc.nextInt();
			System.out.println("A idade inserida foi: " + idade);
		}
		
		System.out.println("Continua Aqui ... \n");
		
		

	}

}
