package xmlconfig.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import xmlconfig.example.services.HelloWorldService;


@Controller
public class GreetingController {

    @Autowired
    HelloWorldService helloWorldService;

    public void display() {
        System.out.println(helloWorldService.sayHello());
    }

}
