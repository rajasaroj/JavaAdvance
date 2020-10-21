package com.example.dependencyInjection;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("associate")
public class AssociateGreeterImpl implements GreeterService {
    @Override
    public void sayHello() {
        System.out.println("Hello world from Asociate");
    }
}
