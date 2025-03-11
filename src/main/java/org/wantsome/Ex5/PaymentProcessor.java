package org.wantsome.Ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {

    private final PaymentService paymentService;

    @Autowired
    public PaymentProcessor(@Qualifier("creditCard")
                                 PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String processPayment(double amount) {
        return paymentService.processPayment(amount);
    }

}
