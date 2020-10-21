package spring.factorymethod.services;

public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Привет мир");
    }
}

