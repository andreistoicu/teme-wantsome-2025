package org.wantsome.Week15_TemeSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExerciseApplication {
    public static void main(String[] args) {
//        SpringApplication.run(SpringExerciseApplication.class, args);
//    }
//
//    @Bean
//    public ComandLineRunner comandLineRunner(ApplicationContext ctx){
//        return args -> {
//            MainService mainService = ctx.getBean(MainService.class);
//        };
//    }
//}
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
// The context is now initialized and beans are created
            System.out.println("Spring context initialized");
        }
    }
}