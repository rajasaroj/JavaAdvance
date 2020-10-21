package spring.factorymethod.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.factorymethod.services.HelloWorldService;


@Controller
public class GreetingController {

    @Autowired
    HelloWorldService helloWorldService;

    public void display() {
        helloWorldService.sayHello();
    }

}
