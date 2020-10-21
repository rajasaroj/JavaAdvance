package spring.factorymethod.services;

public class HelloWorldServiceFrenchImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Joi Bonjouir!!!");
    }
}
