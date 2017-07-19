package io.fdlessard.codebites.strategypattern.processors;

import java.math.BigDecimal;

public class CreditCardPaymentProcessorImpl implements PaymentProcessor {

    public void pay(String name, BigDecimal amount) {
        System.out.println(name + ": CreditCardPaymentProcessorImpl.pay(" + amount + ")");
    }

}
