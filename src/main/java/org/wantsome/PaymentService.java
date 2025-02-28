package org.wantsome;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
     void processPayment(double amount);
}
