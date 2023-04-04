package com.fundamentosplatzi.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{
	
		private ComponentDependency dependencia;
	
	//la anotacion qualifier se usa para indicar cual dependencia toma, en caso de que dos dependencias usen una misma interfaz
	@Autowired
	public FundamentosApplication(@Qualifier("component2Implement") ComponentDependency dependencia) {//qualifier toma el nombre de la clase pero con minuscula al principio
		this.dependencia = dependencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dependencia.saludar();
		
	}

}
