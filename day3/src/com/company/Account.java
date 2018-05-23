package com.company;

public class Account {

    private String name;
    public int balance;

    public Account(int amount){
    balance=amount;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    public void setAmount(int amount){
        balance=amount;
    }
    public int getAmount(){
        return balance;
    }
}
