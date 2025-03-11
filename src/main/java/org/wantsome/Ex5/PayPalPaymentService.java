package org.wantsome.Ex5;

import org.springframework.stereotype.Service;

@Service("paypal")
public class PayPalPaymentService implements PaymentService {

    @Override
    public String processPayment(double amount) {
        return "Processing PayPal payment of $" + amount;

    }
}
