package org.wantsome;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmailService {
    public void sendWelcomeEmail(String email){
        System.out.println("Sending welcome email to: " + email);
    }
}
