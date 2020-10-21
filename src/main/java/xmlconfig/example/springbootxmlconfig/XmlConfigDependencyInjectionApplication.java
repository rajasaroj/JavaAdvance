package xmlconfig.example.springbootxmlconfig;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import xmlconfig.example.controllers.GreetingController;

@SpringBootApplication
@ImportResource("classpath:/xml-spring-config/spring-config.xml")
public class XmlConfigDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(XmlConfigDependencyInjectionApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.display();
    }
}
