package com.dxc.springcoreassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {
	public static void main(String ar[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		GreeterService obj = context.getBean(GreeterService.class);
		obj.printGreeting();
		
	}

}
