package com.ba.patterns.strategy;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number,String date,String cvv){
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.amount = 100_000;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
