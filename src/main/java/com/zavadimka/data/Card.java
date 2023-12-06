package com.zavadimka.data;

public abstract class Card {

    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected PaymentSystem paymentSystem;

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }


    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }
    public void getBalance() {
        System.out.println("Current balance: " + balance + " USD.");
    }

    public void addBalance(int amount){
        balance=+ amount;
        System.out.println("Account funded for " + amount + " USD. Your current balance: " + balance + " USD.");
    }


    protected abstract boolean isCountryValidForThisCard(Country country);

    protected boolean isBalanceNotLessThanPayment(int amount) {
        return balance >= amount;
    }

    public void payInCountry(Country country, int amount) {
        if (isCountryValidForThisCard(country) && isBalanceNotLessThanPayment(amount)) {
            balance -= amount;
            System.out.println("Payment for " + amount + " USD accepted.");
            System.out.println("Current balance: " + balance + " USD.");
        } else {
            System.out.println("Payment for " + amount + " USD is impossible.");
            System.out.println("Current balance: " + balance + " USD.");
        }
    }


}
