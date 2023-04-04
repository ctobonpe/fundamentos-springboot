package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class Component2Implement implements ComponentDependency{

	@Override
	public void saludar() {
		System.out.println("Hola desde el componente dos");
	}

}
