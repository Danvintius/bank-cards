package org.example;

public class PlusCard extends DebitCard {

    @Override
    protected void add(int sum) {
        balance += sum;
        if (sum > 10000) {
            int cashback = (sum / 100) * 1;
            balance += cashback;
        }
    }
}
