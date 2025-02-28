package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class MainService {
    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private CounterService counterServicePrototype1;

    @Autowired
    private CounterService counterServicePrototype2;

    @Autowired
    private UserService userService;

    @Autowired
    private DatabaseService databaseService;

    @Autowired
    private PaymentProcessor paymentProcessor;

    @Autowired
    private SpecialPaymentProcessor specialPaymentProcessor;

    @PostConstruct
    public void init() {
        helloWorldService.sayHello();
        greetingService.greet("Nicu");
        System.out.println("Prototype 1:" + counterServicePrototype1.increment());
        System.out.println("Prototype 1:" + counterServicePrototype1.increment());
        System.out.println("Prototype 2:" + counterServicePrototype2.increment());
        System.out.println("Prototype 2:" + counterServicePrototype2.increment());
        userService.createUser("NicuTudosa", "nicutudosa@wantsome.com");
        databaseService.connect();
        databaseService.disconnect();
        paymentProcessor.process(50);
        specialPaymentProcessor.makeSpecialPayment(50);

    }
    @PreDestroy
    public void cleanup(){
        System.out.println("Cleaning up resources.......");
    }

}
