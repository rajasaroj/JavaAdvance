In this example spring.factorymethod

We have used factory method design pattern to create object of various impls

Reason we used factory method: Now our web application has really grow too popular and people from many different countries want to interact and greeted by
                               our awesome web application.

                               Problem here: the process for creating the impl object has became too complex for our small head java brains.
                                             as the people from various part of the world are going to interact with our application.
                                             Here we need a scalable mechanism that can handle the complexities of creating the impl objects on runtime based upon users nationality and from development side the develop must have enough freedom
                                             to add new language impl's for the people visiting from remote part of the world with other laguange.
                                             so the design should handle 2 thing primarily:
                                             1) handle the complixeties for creating impl objects based upon users nationality
                                             2) developer must be able to add new language impl without touching the factory class again.




Solution: Factory Design Pattern with Spring Autowiring Magic Comes to the rescue!

          1) write a factory class, the objective of this factory class will be to take the nationality of user based on that creates the object of impl class belong to that nationality or language spoken in that nationality
          2) add a setter in the class so that the developer can add new nationality code and impl class which will have the logic for greeting users with the laguange that is spoken by user nationality.

          3) Annotate them with bean so that it can create spring bean of those object and IOC can inject them to the controller class
          4) Voila you've just scaled up you're App to support users/visitors from new nationalities.



Advanced Dependency Injection Tips: (Since you can have multiple impl's present for supporting many languages)

1) You can use the combination of @Bean(name = "<name for imple bean>") and inject that bean using qualifier("<name of the bean>")
2) in order to do 1) you have to modify the "@Bean" for the method return in object of impl's in Factory class