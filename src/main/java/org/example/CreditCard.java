package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class CreditCard extends BankCard {
    private final int limit;
    protected int credit;
    protected int ownFunds;
    public CreditCard(int limit) {
        this.limit = limit;
        this.credit = limit;
    }

    @Override
    protected void getInfo() {
        System.out.println(
                "Кредитная карта с лимитом " + limit + "\nКредитные средства: " + credit + "\nСобственные средства: " + ownFunds
        );
    }

    @Override
    protected boolean pay(int sum) {
        if (sum <= ownFunds) {
            ownFunds -= sum;
        } else if (ownFunds <= 0) {
            credit -= sum;
        } else {
                int x = sum - ownFunds;
                int y = sum - x;
                ownFunds -= y;
                credit -= x;
            }
        balance -= sum;
        return true;
    }

    @Override
    protected void add(int sum) {
        if (credit < limit) {
            int x = limit - credit;
            if (sum >= x) {
                credit += x;
                ownFunds += (sum - x);
            } else {
                credit += sum;
            }
        } else {
            ownFunds += sum;
        }
    }

    @Override
    protected void getBalance() {
        int balance = credit + ownFunds;
        System.out.println("Баланс карты: " + balance);
    }
}
