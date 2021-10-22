package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		// ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// IFlowTest IFT = context.getBean(IFlowTest.class);
		//SpringApplication.run(DemoApplication.class, args);
		AppConfig appConfig = new AppConfig();
		IFlowTest IFT = appConfig.createFlowTest();
		System.out.println(IFT.getResult("1"));
		System.out.println(IFT.getResult("0"));
		System.out.println(IFT.getResult("five"));
	}

}
