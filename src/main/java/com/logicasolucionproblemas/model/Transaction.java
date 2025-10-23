package com.logicasolucionproblemas.model;
import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private Money amount;
    private String accountId;
    private LocalDateTime timestap;

    public Transaction(LocalDateTime timestap) {
        this.timestap = timestap;
    }

    public Transaction(String type, Money amount, String accountId, LocalDateTime timestap) {
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
        this.timestap = timestap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public LocalDateTime getTimestap() {
        return timestap;
    }

    public void setTimestap(LocalDateTime timestap) {
        this.timestap = timestap;
    }
}
