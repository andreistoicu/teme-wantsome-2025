package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wantsome.payment.PaymentProcessors;

import javax.annotation.PostConstruct;

@Service
public class MainService {

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private CounterService counterService1;

    @Autowired
    private CounterService counterService2;

    @Autowired
    private UserService userService;

    @Autowired
    private DatabaseService databaseService;

    @Autowired
    private PaymentProcessors paymentProcessors;

    @PostConstruct
    public void run() {
        System.out.println("MainService run method");
        helloWorldService.sayHello();
        greetingService.greet("John");
        System.out.println(counterService1.increment());
        System.out.println(counterService2.increment());
        userService.createUser("John", "john@example.com");
        databaseService.connect();
        databaseService.disconnect();
        paymentProcessors.processPayment(100.0);
    }



}
