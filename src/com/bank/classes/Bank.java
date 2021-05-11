package com.bank.classes;


public class Bank {

    private String account_number;
    private String pin;
    private long amount;

    public Bank(String account_number, String pin, long amount) {
        this.account_number = account_number;
        this.pin = pin;
        this.amount = amount;
    }

    public Bank(String account_number, String pin) {
        this.account_number = account_number;
        this.pin = pin;
    }

    public Bank() {

    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getPin() {
        return pin;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "account_number='" + account_number + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
