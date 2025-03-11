package org.wantsome.Ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String createUser(String username, String email) {
        String result = "User created with username: " + username + " and email: " + email;
        emailService.sendWelcomeEmail(email);
        return result;
    }

}
