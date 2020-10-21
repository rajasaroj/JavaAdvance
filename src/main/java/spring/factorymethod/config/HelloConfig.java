package spring.factorymethod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import spring.factorymethod.services.HelloWorldFactory;
import spring.factorymethod.services.HelloWorldService;
import spring.factorymethod.services.HelloWorldServiceEnglishImpl;
import spring.factorymethod.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {


    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("default")
    public HelloWorldService helloWorldEnglish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldSpanish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("es");
    }

    @Bean
    @Profile("russian")
    public HelloWorldService helloWorldRussian(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("ru");
    }

    @Bean
    @Profile("french")
    public HelloWorldService helloWorldFrench(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("fr");
    }
}
