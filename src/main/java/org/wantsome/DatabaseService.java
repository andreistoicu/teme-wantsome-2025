package org.wantsome;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DatabaseService {

    @PostConstruct
    public void connect() {
        System.out.println("Connection to database...");
    }

    @PreDestroy
    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }

}
