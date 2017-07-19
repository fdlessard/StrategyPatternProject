package io.fdlessard.codebites.strategypattern.processors;

import java.math.BigDecimal;

public interface PaymentProcessor {

    void pay(String name, BigDecimal amount);
}
