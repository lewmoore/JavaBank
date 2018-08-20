package com.java.bank;

public class Account
{
    public int balance;

    public void Deposit(int amount)
    {
        balance += amount;
    }

    public String Withdraw(int amount)
    {
        if (balance > amount) {
            balance -= amount;
        }

        return "You don't have enough money";
    }
}
