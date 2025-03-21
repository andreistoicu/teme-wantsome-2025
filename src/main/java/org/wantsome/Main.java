package org.wantsome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello All");
        SpringApplication.run(Main.class, args);
    }
}