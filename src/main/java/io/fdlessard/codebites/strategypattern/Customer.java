package io.fdlessard.codebites.strategypattern;

import io.fdlessard.codebites.strategypattern.processors.PaymentProcessor;

import java.math.BigDecimal;

public class Customer {

    private String name;

    private BigDecimal accountBalance;

    private PaymentProcessor paymentProcessor;

    public Customer(String name, PaymentProcessor paymentProcessor) {
        this.name = name;
        this.paymentProcessor = paymentProcessor;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void payAccountBalance() {
        paymentProcessor.pay(name, accountBalance);
    }
}
