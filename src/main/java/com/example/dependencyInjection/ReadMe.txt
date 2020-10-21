1) This DI example expalains one of the powerful feature of spring

Problem: when one interface has multiple implementation, then while injecting the implementation objects in the service class
Abiguity problem arises, because the spring has created the spring beans of all the implementation of interface and now they are present inside the spring context.
during the time (Runtime) of injecting dependencies, looking at multiple impls in sring context the IOC get confused and throws abiguity error.

Solution: this type of abiguity issue can be resolved by 2 method
1) Qualifiers: in this case you name the components impls uniquely and anotate the object with qualifier and inside it param provide the name of component impl
2) Profile: anotatate all the impl class with unqiue name inside @profile("xyz") and set the property in application.properties as (spring.profiles.active=<name of your profile>)
with profile you can also set default profile you just have to write "defualt" in profile
like this: @Profile("default") or @Profile({"default", "<some other name>"}) so in this case even if you mention nothing in application.properties spring will still be able to locate correct default impl and inject it in service.



2) Spring Vision ablility to look accross packages for Beans.

Problem: Let say you've have seggregated your classes in your applciation where Service and Impls classes are in other package,
         Controllers are in other packages and pojo are in other packages.
         Now if you try to wire up these objects from other packages then by default you might no be able to do so, since you spring boot app is looking into one one directory it might not be able to find the bean definition which are present in other package.
         and you will run into "NoBeanDefinationFound Exception".

Solution: 1) @ComponentScan({<base package here>})
          the ComponentScan increases the visiblity of spring and allows spring to look for the bean in the hierarchy of package present in base package.
          this solve the problem of missing bean defination.
          it does the scanning of all the packages right during the startup and inspects everthing that annotated with spring annotation.