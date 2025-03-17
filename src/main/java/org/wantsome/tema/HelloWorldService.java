package org.wantsome.tema;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public void sayHello() {
        System.out.println("Hello world!");
    }
}
