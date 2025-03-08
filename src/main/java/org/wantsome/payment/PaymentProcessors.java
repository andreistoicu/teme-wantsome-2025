package org.wantsome.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessors {

    private final PaymentService paymentService;

    public PaymentProcessors(@Qualifier("payPalPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment(double amount) {
        paymentService.processPayment(amount);
    }
}
