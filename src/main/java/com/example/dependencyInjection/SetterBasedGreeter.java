package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedGreeter {

    GreeterService greeterService;

    @Autowired
    public void setGreeterService(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    public void displayHello() {
        greeterService.sayHello();
    }

}
