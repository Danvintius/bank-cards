package org.example;

public class SuperCard extends DebitCard {
    @Override
    protected boolean pay(int sum) {
        int cashback = (sum / 100) * 5;
        balance -= sum;
        if (sum > 3000) {
            balance += cashback;
        }
        return true;
    }
}
