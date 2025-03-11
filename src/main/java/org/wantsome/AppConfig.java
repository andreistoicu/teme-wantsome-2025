package org.wantsome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.wantsome.Ex4.DataBaseService;

@Configuration
@ComponentScan("org.wantsome")
public class AppConfig {
    @Bean
    public DataBaseService dataBaseService() {
        return new DataBaseService();
    }
}
