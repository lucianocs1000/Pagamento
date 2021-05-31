package com.LUCIANO.Mv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvApplication.class, args);
		
		
		AnnotationConfigApplicationContext  applicationContext  =  new  AnnotationConfigApplicationContext();
		
		applicationContext.close();
		
		System.out.println("FIM");
		
		
		
	}

}
