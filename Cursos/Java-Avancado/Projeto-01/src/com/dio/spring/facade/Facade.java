package com.dio.spring.facade;

import com.dio.spring.subsistema1.crm.CrmService;
import com.dio.spring.subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
	
}