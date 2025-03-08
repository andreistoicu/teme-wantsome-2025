package org.wantsome.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CreditCardPaymentService implements PaymentService {

    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}
