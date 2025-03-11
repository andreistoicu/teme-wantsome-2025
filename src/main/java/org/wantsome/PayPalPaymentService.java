package org.wantsome;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of : " + amount + " RON");
    }

}
