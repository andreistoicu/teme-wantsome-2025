package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wantsome.Ex1.GreetingService;
import org.wantsome.Ex1.HelloWorldService;
import org.wantsome.Ex2.CounterService;
import org.wantsome.Ex2.SingleCounterService;
import org.wantsome.Ex3.UserService;
import org.wantsome.Ex4.DataBaseService;
import org.wantsome.Ex5.PaymentProcessor;
import javax.annotation.PostConstruct;

@Service
public class MainService {

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private HelloWorldService helloWorldService;
    @Autowired
    private SingleCounterService singletonCounter2;
    @Autowired
    private SingleCounterService singletonCounter1;
    @Autowired
    private CounterService prototypeCounter1;
    @Autowired
    private CounterService prototypeCounter2;

    private final UserService userService;
    private final DataBaseService dataBaseService;
    private final PaymentProcessor paymentProcessor;

    @Autowired
    public MainService(UserService userService, DataBaseService dataBaseService, PaymentProcessor paymentProcessor) {
        this.userService = userService;
        this.dataBaseService = dataBaseService;
        this.paymentProcessor = paymentProcessor;
    }

    @PostConstruct
    public void init() {

        helloWorldService.sayHello();
        greetingService.greet("Mihai");

        System.out.println("Prototype Counter 1:" +
                prototypeCounter1.increment());

        System.out.println("Prototype Counter 1:" +
                prototypeCounter1.increment());

        System.out.println("Prototype Counter 2:" +
                prototypeCounter2.increment());

        System.out.println("Singleton Counter 1:" +
                singletonCounter1.increment());

        System.out.println("Singleton Counter 1:" +
                singletonCounter1.increment());

        System.out.println("Singleton Counter 2:" +
                singletonCounter2.increment());

        System.out.println(userService.createUser("IonGondrea", "gondrea.02@gmail.com"));

        dataBaseService.connectToDatabase();
        dataBaseService.disconnectFromDatabase();

        System.out.println(paymentProcessor.processPayment(100));
    }

}
