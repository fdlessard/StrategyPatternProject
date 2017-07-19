package io.fdlessard.codebites.strategypattern.processors;

import java.math.BigDecimal;

public class DebitCardPaymentProcessorImpl implements PaymentProcessor {

    public void pay(String name, BigDecimal amount) {
        System.out.println(name + ": DebitCardPaymentProcessorImpl.pay(" + amount + ")");
    }
}
