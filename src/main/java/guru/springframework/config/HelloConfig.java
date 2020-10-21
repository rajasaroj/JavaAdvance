package guru.springframework.config;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

/*    @Bean("demoService")
    public HelloWorldService helloWorldServiceNormal() {
        return new HelloWorldServiceEnglishImpl();
    }*/

    @Bean
    @Profile("default")
    public HelloWorldService helloWorldEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }

}
