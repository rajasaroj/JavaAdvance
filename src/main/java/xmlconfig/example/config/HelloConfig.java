package xmlconfig.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import xmlconfig.example.services.HelloWorldFactory;
import xmlconfig.example.services.HelloWorldService;

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
