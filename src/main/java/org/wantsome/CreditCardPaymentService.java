package org.wantsome;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service
@Primary
public class CreditCardPaymentService implements PaymentService {
    public void processPayment(double amount){
        System.out.println("Processing the Credit Card payment of : " + amount + " RON");
    }

}
