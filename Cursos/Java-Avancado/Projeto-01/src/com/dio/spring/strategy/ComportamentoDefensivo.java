package com.dio.spring.strategy;

public class ComportamentoDefensivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se Defensivo");
	}

}
