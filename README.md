# ImportSelectExample
An example project to manage modules with multiple bean implementation using Spring Boot and the ImportSelect interface.

A single app with multi module implementation. In the common module there are the common classes that can be used from all the customers.
The core module is the default implementation.
In the others module there are override of the core implementation, so it is possibile to have different implementation for
different cusotmers.

By default the bean generate at runtime is undere the package of core module. 
The ImportSelect implementation can load more beans if the property is set.
The behavior is obtatin using the @Configuration annotation. The ImportSelect implementation recall a configuration class
in the other module where is used the @ComponentScan annotation to load the beans of the module

To run this project, run in the project's root folder 

```
mvn clean install
```

After that, go to the core directory module and run

```
mvn clean spring-boot:run
```

To see the result, you can connect into your browser to this url

```
http://localhost:8080/item
```

In the core module there is the file application.properties with only one property

```
ise.customer=
```

This property can have four different values 

```
ise.customer=
ise.customer=customera
ise.customer=customerb
ise.customer=customerc
```

Test the different results with the different values of the property
