package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

//configurar un bean manualmente
@Configuration
public class MyConfigurationBean {
	@Bean
	public MyBean beanMyBeanOperation() {
	 return new MyBean2Implement();
	}
	
	@Bean
	public MyOperation beanMyOperationOperation() {
	 return new MyOperationImplement();
	}
	
	// como este bean tiene una dependencia MyOperation, se le agrega al metodo la interfaz de MyOperation
	@Bean
	public MyBeanWithDependency beanMyBeanWithDependencyOperation(MyOperation myOperation) {
	 return new MyBeanWithDependencyImplement(myOperation);
	}	

	
}
