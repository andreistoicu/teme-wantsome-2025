package org.wantsome;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createUser(String username, String email) {
        System.out.println("User " + username + " created");
        emailService.sentWelcomeEmail(email);
    }
}
