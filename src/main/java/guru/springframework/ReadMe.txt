In this example of guru.springframework package.

we are doing Dependency Injection with the help of Java Bean using @Configuration and @Bean
instead of doing it with @Component and @Service.

:__ So the question might arise when to use @Configuration and @Bean and when to use @Component and @Service.


Reason: let understand it with senario.

1) let say you are creating a spring boot application which is used to greet the users. as soon as new users arives to your website.
Below steps you will follow:
1) Create Service interface for HelloWorldService
2) Provide implementation classes HelloWorldServiceEnglishImpl for English users and HelloWorldServiceSpanishImpl for spanish users.
3) Since both the service and impl's are created by you, You can annotate @Service to HelloWorldService and @Component @Qualifier/@Profile to Impl's
4) Java Spring will create the beans of @annotated classes and IOC will inject them into controller class.
5) Voila! you app works :)

Problem: What if you're using third party libraries for Greeting user and the best part of this libraries is they can not only Greet users in English or Spanish but other languages
         as well for users from other countries.
         Now in this case the service layer "HelloWorldService" interface and Impl's like HelloWorldServiceEnglishImpl & HelloWorldServiceSpanishImpl will not be created by you.
         so you cannot annotate them with  @Component @Qualifier/@Profile  just the way i discussed in above point no 3) and 4).


Solution: Well in this case @Bean and @Configuration comes to the rescue!!!
          1) here you can create A configuration class annotating it as @Configuration this will tell spring to pick up Beans from this class.
          2) Write the method to create the object of Impl's for eg HelloWorldServiceEnglishImpl, HelloWorldServiceEnglishImpl, HelloWorldServiceJapaneseImpl etc
          3) keep the return type as the parent of these class (it could be a service interface just like in our code eg)
          4) Java Spring will discover the @Configuration annotated class and The @Beans from it and IOC will inject them into controller class
          5) Voila! you app worked again! ;)

