**Assignment 1: Basic Annotation-Based Configuration with @PostConstruct**

Objective: Understand basic bean configuration and dependency injection using annotations and @PostConstruct.

Task:

Define two simple Java classes: HelloWorldService and GreetingService.

HelloWorldService should have a method sayHello() that prints "Hello, World!".

GreetingService should have a method greet(String name) that prints "Hello, [name]!".

Annotate these classes with @Service or @Component to make them Spring beans.

Create a configuration class AppConfig annotated with @Configuration and @ComponentScan to scan for components.

In a MainService class, use @Autowired to inject the services and @PostConstruct to call their methods.


**Assignment 2: Bean Scopes with Annotations and @PostConstruct**

Objective: Learn about different bean scopes and their implications using annotations and @PostConstruct.


Task:

Define a CounterService bean with a method increment() that increments and returns a counter value.

Annotate this bean with @Scope to define both singleton and prototype scopes.

In a MainService class, use @Autowired to inject the CounterService beans with different scopes and use @PostConstruct to demonstrate the behavior.


**Note:**
Adapt any a configuration class like AppConfig annotated with @Configuration and @ComponentScan if necessary.


**Assignment 3: Constructor Injection with Annotations and @PostConstruct**

Objective: Practice dependency injection using constructors with annotations and @PostConstruct.


Task:

Define two services: UserService and EmailService.

UserService should have a method createUser(String username, String email) that calls EmailService.sendWelcomeEmail(String email).

EmailService should have a method sendWelcomeEmail(String email) that prints a welcome email message.

Use constructor injection to inject EmailService into UserService using @Autowired.

Annotate these classes with @Service or @Component to make them Spring beans.

In a MainService class, use @Autowired to inject UserService and use @PostConstruct to create a user and send a welcome email.



**Assignment 4: Java-based Configuration with @Bean and @PostConstruct**

Objective: Configure beans using Java-based configuration with @PostConstruct.

Task:

Define a DatabaseService class with methods to connect (prints the string "Connecting to database...") and disconnect (prints the string "Disconnecting from the database...") from a database.

In AppConfig, define the DatabaseService bean using the @Bean annotation.

In a MainService class, use @Autowired to inject DatabaseService and use @PostConstruct to demonstrate connecting and disconnecting from the database.



**Assignment 5: Autowiring and Qualifiers with Annotations and @PostConstruct**

Objective: Learn to use @Autowired and @Qualifier for injecting specific beans with @PostConstruct.

Task:

Define an interface PaymentService with a method processPayment(double amount).

Create two implementations of PaymentService: CreditCardPaymentService and PayPalPaymentService.

Annotate these implementations with @Service or @Component.

Use the @Qualifier annotation to inject a specific implementation of PaymentService in a PaymentProcessor class.

In a MainService class, use @Autowired to inject PaymentProcessor and use @PostConstruct to process a payment.


