In this example we are using spring xml feature to kick off our application.

This is how our application works with xml configs:
1) While load the bean in the spring context this is called @ImportResource("classpath:/xml-spring-config/spring-config.xml") from your app XmlConfigDependencyInjectionApplication
it says the to read the information the spring-config.xml file at this particular class path /xml-spring-config/spring-config.xml

2) inside spring-config.xml we have mentioned <context:component-scan base-package="xmlconfig.example"></context:component-scan>
   it asks spring context to scan the components in the hierarchy of this package xmlconfig.example

Note:
In this code we have removed the annotation from HelloConfig files as well as controller class XmlBeanedgreetingController
all the beans creation and autowired is now happening through xml-spring-config/spring-config.xml