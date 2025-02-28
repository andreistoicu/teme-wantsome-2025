package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
