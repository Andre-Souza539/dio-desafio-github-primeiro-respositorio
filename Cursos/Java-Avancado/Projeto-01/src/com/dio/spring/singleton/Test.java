package com.dio.spring.singleton;

import com.dio.spring.facade.Facade;
import com.dio.spring.strategy.Comportamento;
import com.dio.spring.strategy.ComportamentoAgressivo;
import com.dio.spring.strategy.ComportamentoDefensivo;
import com.dio.spring.strategy.ComportamentoNormal;
import com.dio.spring.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
	 	Comportamento agressivo = new ComportamentoAgressivo();
	 	Comportamento defensivo = new ComportamentoDefensivo();
		
	 	Robo robo = new Robo();
	 	robo.setComportamento(normal);
	 	robo.mover();
	 	robo.mover();
	 	robo.setComportamento(agressivo);
	 	robo.mover();
	 	robo.mover();
	 	robo.mover();
	 	robo.setComportamento(defensivo);
	 	robo.mover();
	 	
	 	//Facade
	 	
	 	Facade facade = new Facade();
	 	facade.migrarCliente("André", "50850360");
	 	
	
	}

}
