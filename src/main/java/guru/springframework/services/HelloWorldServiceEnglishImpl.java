package guru.springframework.services;

public class HelloWorldServiceEnglishImpl implements HelloWorldService{
    @Override
    public void sayHello() {
        System.out.println("Hello world!");
    }
}
