package com.dio.spring.singleton;

/**
 * 
 * Singleton "Lazy Holder".
 * 
 * @author aljsjunca
 * 
 * 
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
