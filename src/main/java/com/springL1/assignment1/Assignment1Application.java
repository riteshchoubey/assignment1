package com.springL1.assignment1;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		
			return args ->{ System.out.println("Inspect the beans provided by spring boot");
			String[] beanName = ctx.getBeanDefinitionNames();
			Arrays.sort(beanName);
			for(String bean:beanName) {
				System.out.println(bean);
			}
			};				
			
		
	}
}
