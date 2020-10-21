package com.example.dependencyInjection;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("senior")
public class GreeterImpl implements GreeterService {
    @Override
    public void sayHello() {
        System.out.println("Hello world from senior");
    }
}
