package org.wantsome.Ex1;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public void greet(String name){
        System.out.println( "Hello " + name + "!");
    }
}
