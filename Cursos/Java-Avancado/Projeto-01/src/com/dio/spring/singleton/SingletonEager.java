package com.dio.spring.singleton;

/**
 * 
 * Singleton "Eager".
 * 
 * @author aljsjunca
 * 
 * 
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
