package org.wantsome.Week15_TemeSpring;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void greet(){
        System.out.println("Hello, [name]!");
    }
}
