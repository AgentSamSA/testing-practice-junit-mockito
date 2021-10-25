package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IFlowTest IFT = context.getBean(IFlowTest.class);
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		System.out.println(IFT.getResult(userInput));
	}
}
