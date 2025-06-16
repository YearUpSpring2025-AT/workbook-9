package com.pluralsight.classDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ClassDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(ClassDemo1Application.class, args);

//		for (String bean : context.getBeanDefinitionNames()) {
//			System.out.println(bean);
//		}

	}

}
