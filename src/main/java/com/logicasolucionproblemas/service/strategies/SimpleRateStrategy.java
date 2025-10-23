package com.logicasolucionproblemas.service.strategies;

import org.springframework.stereotype.Component;

import com.logicasolucionproblemas.service.InterestStrategy;



@Component
public class SimpleRateStrategy implements InterestStrategy {

    
    private double rate;

    public SimpleRateStrategy() {

    }

    @Override
    public double calculateInterest(double balance) {
        return balance * rate;
    }

    public double getRate() { return rate; }
    
}