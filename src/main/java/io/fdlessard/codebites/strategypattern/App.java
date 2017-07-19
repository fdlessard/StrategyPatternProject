package io.fdlessard.codebites.strategypattern;

import io.fdlessard.codebites.strategypattern.processors.CreditCardPaymentProcessorImpl;
import io.fdlessard.codebites.strategypattern.processors.DebitCardPaymentProcessorImpl;
import io.fdlessard.codebites.strategypattern.processors.PaypalPaymentProcessorImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Strategy Pattern App");
        System.out.println("--------------------");
        System.out.println("");

        Customer debitCardCustomer = new Customer("DebitCardCustomer", new DebitCardPaymentProcessorImpl());
        Customer creditCardCustomer = new Customer("CreditCardCustomer", new CreditCardPaymentProcessorImpl());
        Customer paypalCustomer = new Customer("PaypalCustomer", new PaypalPaymentProcessorImpl());

        List<Customer> customers = new ArrayList<Customer>();

        customers.add(debitCardCustomer);
        customers.add(creditCardCustomer);
        customers.add(paypalCustomer);


        debitCardCustomer.setAccountBalance(new BigDecimal(100.00));
        creditCardCustomer.setAccountBalance(new BigDecimal(1200.00));
        paypalCustomer.setAccountBalance(new BigDecimal(50.00));

        customers.stream().forEach(Customer::payAccountBalance);


    }

}
