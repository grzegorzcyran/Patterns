package edu.grcy.patterns.practise.bank;

public class Account {
    private String accountName;
    private int balance;
    private int interestCalculated;

    public Account(String accountName) {
        this.accountName = accountName;
        balance = 0;
        interestCalculated = 0;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public int getInterestCalculated() {
        return interestCalculated;
    }

    public int deposit(int amountToDeposit) {
        balance += amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw;
        return balance;
    }
}
