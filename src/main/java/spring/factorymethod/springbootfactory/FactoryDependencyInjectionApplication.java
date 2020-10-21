package spring.factorymethod.springbootfactory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.factorymethod.controllers.GreetingController;

@SpringBootApplication
@ComponentScan("spring.factorymethod")
public class FactoryDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FactoryDependencyInjectionApplication.class, args);

        /*HelloWorldService obj = (HelloWorldService) ctx.getBean("demoService");
        obj.sayHello();*/

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.display();
    }
}
