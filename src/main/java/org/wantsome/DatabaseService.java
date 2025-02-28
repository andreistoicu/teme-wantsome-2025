package org.wantsome;

import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    public void connect(){
        System.out.println("Connecting to database... Please wait!  ");
    }

    public void disconnect(){
        System.out.println("Disconnecting from the database. Please wait! .... ");
    }
}
