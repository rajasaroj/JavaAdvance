package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorGreeter {

    @Autowired
    GreeterService greeterService;

//    public ConstructorGreeterImpl(GreeterService greeterService) {
//        this.greeterService = greeterService;
//    }


    public void displayHello() {
        System.out.println("about to greet");
        greeterService.sayHello();
    }
}
