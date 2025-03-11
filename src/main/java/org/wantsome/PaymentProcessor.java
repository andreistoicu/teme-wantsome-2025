package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
    private final PaymentService paymentService;

    @Autowired
    public PaymentProcessor(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void process(double amount){
        paymentService.processPayment(amount);
    }

}
