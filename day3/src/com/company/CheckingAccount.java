package com.company;

public class CheckingAccount extends Account {
    public CheckingAccount(int amount){
        super(amount);
    }

    public void withdraw(int amount){
        setAmount(balance-amount);
    }
}
