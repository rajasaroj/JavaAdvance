In this example we are using spring xml feature to kick off our application.

This is how our application works with xml configs:
1) While load the bean in the spring context this is called @ImportResource("classpath:/xml-spring-config/spring-config.xml") from your app XmlConfigDependencyInjectionApplication
it says the to read the information the spring-config.xml file at this particular class path /xml-spring-config/spring-config.xml

2) inside spring-config.xml we have mentioned <context:component-scan base-package="xmlconfig.example"></context:component-scan>
   it asks spring context to scan the components in the hierarchy of this package xmlconfig.example

Note:
In this code we have removed the annotation from HelloConfig files as well as controller class XmlBeanedgreetingController
all the beans creation and autowired is now happening through xml-spring-config/spring-config.xml


Branch: ImportingXmlConfigFilesForTestablility

In this example we have segreated the contents in our spring-config.xml file to orgarize our beans and our default beans
When you do that it will give you enormous amount of flexiblity for Integration testing the application

This also enable us to run the application with different configuration on different enviornment

In our example you can see, all the beans related to impl's are stored in helloworld-config.xml and the default beans are added into separate xml files
This will help you to compose you application during the time of testing and perform integration test only on the part of application.
As you can see from the Test code we are composing the beans in the context using
"classpath:xml-spring-config/helloworld-config.xml",
 and "classpath:xml-spring-config/english-hello-world.xml" for english integration testing

 ans
 "classpath:xml-spring-config/helloworld-config.xml",
  and "classpath:xml-spring-config/spanish-hello-world.xml" for spanish integration testing
