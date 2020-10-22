package xmlconfig.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import xmlconfig.example.services.HelloWorldService;

// The bean of this class is delared in the /xml-spring-config/spring-config.xml file hence theres no need  to delared @Controller
public class XmlBeanedGreetingController {

// below annotation for Autowiring has been remove and decalared in /xml-spring-config/spring-config.xml file
//    @Autowired
//    @Qualifier("french")
    HelloWorldService helloWorldService;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void display() {
        System.out.println(helloWorldService.sayHello());
    }

}
