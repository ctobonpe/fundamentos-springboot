package com.fundamentosplatzi.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{
	
	
	private ComponentDependency dependencia;
	
	@Autowired 
	public FundamentosApplication(ComponentDependency dependencia) {
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
