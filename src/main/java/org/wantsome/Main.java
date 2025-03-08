package org.wantsome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext ignored = new AnnotationConfigApplicationContext(AppConfig.class))
        {
            System.out.println("Spring context initialized");
        }
    }

}