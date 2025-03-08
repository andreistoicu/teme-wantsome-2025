package org.wantsome;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sentWelcomeEmail(String email) {
        System.out.println("Welcome " + email + "!");
    }
}
