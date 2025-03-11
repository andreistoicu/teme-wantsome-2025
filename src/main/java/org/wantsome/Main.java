package org.wantsome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World2!");

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
            System.out.println("Spring context initialized");
        }
    }


}