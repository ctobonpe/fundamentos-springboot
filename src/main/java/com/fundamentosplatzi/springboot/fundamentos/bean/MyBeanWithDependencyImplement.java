package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.springframework.stereotype.Component;

//como se hace manual no aplica la anotacion de component, en la clase de configuracion va lo de la dependencia
public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

	private MyOperation myOperation;
	
	public MyBeanWithDependencyImplement(MyOperation myOperation) {
		this.myOperation = myOperation;		
	}
	
	
	@Override
	public void printWithDependency() {
		System.out.println("La suma es igual a" + myOperation.suma(6));
		System.out.println("Hola desde la implementacion de un bean con dependencia");
		
	}

}
