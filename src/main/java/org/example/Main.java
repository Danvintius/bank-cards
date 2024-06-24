package org.example;

public class Main {
    public static void main(String[] args) {
        SuperCard card1 = new SuperCard();
        CashBackCreditCard card2 = new CashBackCreditCard(10000);
        card2.getInfo();
        card2.getBalance();
        card2.pay(5000);
        card2.getBalance();
        card2.add(6000);
        card2.getBalance();
        card2.pay(3000);
        card2.getInfo();
        card2.getBalance();
        card2.add(2000);
        card2.getInfo();
        card2.add(5000);
        card2.getInfo();
        card2.getBalance();
    }
}