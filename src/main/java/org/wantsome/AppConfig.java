package org.wantsome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.wantsome")
public class AppConfig {
    @Bean
    public DatabaseService databaseService(){
        return new DatabaseService();
    }
}
