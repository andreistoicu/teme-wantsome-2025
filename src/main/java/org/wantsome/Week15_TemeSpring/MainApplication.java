/*
package org.wantsome.Week15_TemeSpring;


import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    public ComandLineRunner comandLineRunner(ApplicationContext ctx){
        return args -> {
            CounterService counterService1 = ctx.getBean(CounterService.class);
            System.out.println("Counter 1: " + counterService.increment());
            System.out.println("Counter 1: " + counterService.increment());

            CounterService counterService2 = ctx.getBean(CounterService.class);
            System.out.println("Counter 2: " + counterService.increment());
            System.out.println("Counter 2: " + counterService.increment());
        };
    }
}
*/
