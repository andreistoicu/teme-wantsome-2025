package org.wantsome.dao;

public class BankAccount {
    private Long accountNumber;
    private String accountHolder;
    private int balance;

    public BankAccount(Long accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }
}
