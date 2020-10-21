package com.example.demo;

import com.example.dependencyInjection.ConstructorGreeter;
import com.example.dependencyInjection.SetterBasedGreeter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(MyAppApplication.class, args);
		ConstructorGreeter constructorGreeter = (ConstructorGreeter) ctx.getBean("constructorGreeter");
		constructorGreeter.displayHello();

		SetterBasedGreeter setterBasedGreeter = (SetterBasedGreeter) ctx.getBean("setterBasedGreeter");
		setterBasedGreeter.displayHello();
	}

}
