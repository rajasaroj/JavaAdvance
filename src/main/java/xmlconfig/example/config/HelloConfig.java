package xmlconfig.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import xmlconfig.example.services.HelloWorldFactory;
import xmlconfig.example.services.HelloWorldService;

//@Configuration <- No need of this now because we have defined everything in spring xml config file.
public class HelloConfig {


    // The reason why we commentted this bean because we delared the creation of this bean in /xml-spring-config/spring-config.xml file, it will take care of it!
    /*@Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }*/


    // The reason why we commentted this bean because we delared the creation of this bean in /xml-spring-config/spring-config.xml file, it will take care of it
/*  @Bean
    @Profile("default")
    @Primary
    public HelloWorldService helloWorldEnglish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("en");
    }*/

/*    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldSpanish(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("es");
    }*/

    // The reason why we commentted this bean because we delared the creation of this bean in /xml-spring-config/spring-config.xml file, it will take care of it!
/*  @Bean
    public HelloWorldService helloWorldRussian(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("ru");
    }*/

    // The reason why we commentted this bean because we delared the creation of this bean in /xml-spring-config/spring-config.xml file, it will take care of it!
/*    @Bean
    @Profile("french")
    public HelloWorldService helloWorldFrench(HelloWorldFactory helloWorldFactory) {
        return helloWorldFactory.createHelloWorldService("fr");
    }*/
}
