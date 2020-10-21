package spring.factorymethod.services;

import java.util.HashMap;

public class HelloWorldFactory {

    private HashMap<String, HelloWorldService> serviceHashMap = new HashMap<>();

    public HelloWorldFactory() {
        serviceHashMap.put("en", new HelloWorldServiceEnglishImpl());
        serviceHashMap.put("es", new HelloWorldServiceSpanishImpl());
        serviceHashMap.put("fr", new HelloWorldServiceFrenchImpl());
        serviceHashMap.put("ru", new HelloWorldServiceRussianImpl());
    }
    public HelloWorldService createHelloWorldService(String language) {
        return serviceHashMap.get(language);
    }

    public void setServiceHashMap(String languageCode, HelloWorldService helloWorldService) {
        this.serviceHashMap.put(languageCode, helloWorldService);
    }
}
