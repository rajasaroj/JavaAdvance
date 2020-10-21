package spring.factorymethod.services;

public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Hello world!");
    }
}
