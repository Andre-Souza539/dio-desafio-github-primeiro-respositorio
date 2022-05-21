package br.com.dio.metodo.sobrecarga;

public class Main {
	
	public static void main(String[] args) {
		
		//Quadrilatero
		
		System.out.println("Exercício do Quadrilátero");
		
		double quadrado = QuadrilateroRetorno.area(3); // Área do Quadrado;
		System.out.println("Área do quadrado: " + quadrado + " u²");
		
		double retangulo = QuadrilateroRetorno.area(5d,5d); // Área do Retângulo;
		System.out.println("Área do Retangulo: " + retangulo + " u²");
		
		double trapezio = QuadrilateroRetorno.area(7,8,9); // Área do Trapézio;
		System.out.println("Área do Trapézio: " + trapezio + " u²");
		
		float losango = QuadrilateroRetorno.area(5f,5f); // Área do Losango;
		System.out.println("Área do Losango: " + losango + " u²");
			
		
	}

}
