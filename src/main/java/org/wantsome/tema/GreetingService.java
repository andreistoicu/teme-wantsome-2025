package org.wantsome.tema;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void greet(){
        System.out.println("Hello, [name]!");
    }
}
