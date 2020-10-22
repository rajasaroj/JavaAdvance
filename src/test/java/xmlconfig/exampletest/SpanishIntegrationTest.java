package xmlconfig.exampletest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xmlconfig.example.services.HelloWorldService;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:xml-spring-config/helloworld-config.xml",
        "classpath:xml-spring-config/spanish-hello-world.xml"
})
public class SpanishIntegrationTest {

    @Autowired
    HelloWorldService helloWorldService;

    @Test
    public void testHelloWorld() {
        String greeting = helloWorldService.sayHello();
        assertEquals("Hola Mundo!!!", greeting);
    }

}
