package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
public class GreetingController {

    @Autowired
    HelloWorldService helloWorldService;

    public void display() {
        helloWorldService.sayHello();
    }

}
