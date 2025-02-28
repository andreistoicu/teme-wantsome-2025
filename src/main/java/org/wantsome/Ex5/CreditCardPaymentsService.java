package org.wantsome.Ex5;

import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentsService implements PaymentService{

    @Override
    public String processPayment(double amount) {
        return "Processing credit card payment of $" + amount;

    }
}
