package com.borombo.playgroundfortests;

public class Wallet {

    private int balance = 0;

    public Wallet(int balance) {this.balance = balance;}

    public void deposit(int value){balance += value;}
    public void withdraw(int value){balance -= value;}

    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}
}
