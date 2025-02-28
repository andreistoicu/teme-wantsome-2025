package org.wantsome.Ex3;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendWelcomeEmail(String email){
      return  "Welcome Email sent to: " + email;
    }
}
