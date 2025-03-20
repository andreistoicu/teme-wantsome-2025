package org.wantsome.layered.tema;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void greet(){
        System.out.println("Hello, [name]!");
    }
}
