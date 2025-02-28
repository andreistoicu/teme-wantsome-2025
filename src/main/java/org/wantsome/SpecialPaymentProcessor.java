package org.wantsome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpecialPaymentProcessor {
    private final PaymentService paymentService;

    @Autowired
    public SpecialPaymentProcessor(@Qualifier("payPalPaymentService") PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void makeSpecialPayment(double amount){
        paymentService.processPayment(amount);
    }

}
