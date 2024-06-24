package org.example;

public class CashBackCard extends DebitCard {

    @Override
    protected boolean pay(int sum) {
        int cashback = (sum / 100);
        balance -= sum;
        balance += cashback;
        return true;
    }
}
