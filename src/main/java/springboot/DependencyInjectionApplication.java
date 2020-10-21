package springboot;

import com.example.demo.MyAppApplication;
import guru.springframework.controllers.GreetingController;
import guru.springframework.services.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("guru.springframework")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        /*HelloWorldService obj = (HelloWorldService) ctx.getBean("demoService");
        obj.sayHello();*/

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.display();
    }
}
