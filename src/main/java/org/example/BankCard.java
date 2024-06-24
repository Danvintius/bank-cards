package org.example;

public abstract class BankCard {
    protected int balance;

    protected boolean pay(int sum) {
        balance -= sum;
        return true;
    }

    protected void add(int sum) {
        balance += sum;
    }

    protected void getBalance() {
        System.out.println("Баланс карты: " + balance);
    }

    protected void getInfo() {
        System.out.println("Банковская карта\nБаланс " + balance);
    }
}
