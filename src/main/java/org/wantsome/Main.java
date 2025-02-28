package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World2!");

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
            System.out.println("Spring context initialized");
        }
    }


}