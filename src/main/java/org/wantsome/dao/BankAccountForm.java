package org.wantsome.dao;


public class BankAccountForm {
    private Long accountNumber;
    private String accountHolder;
    private int balance;

    public BankAccountForm(Long accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public BankAccountForm() {
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

}
