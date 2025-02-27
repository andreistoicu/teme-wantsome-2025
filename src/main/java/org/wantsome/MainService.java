package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MainService {
    private final HelloWorldService helloWorldService;
    private final GreetingService greetingService;

    @Autowired
    //this is used to inject the HelloWorldService and GreetingsService into the MainService
    public MainService(HelloWorldService helloWorldService, GreetingService greetingService){
        this.helloWorldService = helloWorldService;
        this.greetingService = greetingService;
    }

    @PostConstruct
    public void init(){
        //call the methods from the injected services
        helloWorldService.sayHello();
        greetingService.greet();
    }
}
