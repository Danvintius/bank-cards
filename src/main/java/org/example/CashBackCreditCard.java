package org.example;

public class CashBackCreditCard extends CreditCard {
    public CashBackCreditCard(int limit) {
        super(limit);
    }

    @Override
    protected boolean pay(int sum) {
        int cashback = (sum / 100);
        if (sum <= ownFunds) {
            ownFunds -= sum;
        } else if (ownFunds <= 0) {
            credit -= sum;
            credit += cashback;
        } else {
            int x = sum - ownFunds;
            int y = sum - x;
            ownFunds -= y;
            credit -= x;
            credit += cashback;
        }
        balance -= sum;
        balance += cashback;
        return true;
    }
}
