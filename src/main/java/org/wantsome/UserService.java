package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }
    public void createUser(String username, String email){
        System.out.println("User created: " + username);
        emailService.sendWelcomeEmail(email);
    }

}
