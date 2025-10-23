package com.logicasolucionproblemas.model;

public class SavingAccount extends Account {
    private double interesRate;

    public SavingAccount(){
        super();
    }

    public SavingAccount(String id, Customer owner, Money balance, double interesRate){
        super(id,owner,balance);
        this.interesRate = interesRate;
    }

    @Override
    public void applyInterest(){
        double newBalance = getBalance().getAmount() + (getBalance().getAmount() *interesRate);
        getBalance().setAmount(newBalance);
    }

    public double getInteresRate(){
        return interesRate;
    }


    public void setInteresRate (double interesRate){this.interesRate = interesRate;}

}
