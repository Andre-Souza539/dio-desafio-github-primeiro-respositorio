package com.dio.spring.subsistema1.crm;

public class CrmService {
	public static void gravarCliente(String nome, String cep, String cidade,String estado) {
		System.out.println("Cliente " + nome +" Gravado");
		System.out.println("Cep: " + cep + " Cidade: " + cidade + " Estado: " + estado);
	}
}
