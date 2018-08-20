package com.java.bank;

public class Account
{
    public int balance;

    public void Deposit(int amount)
    {
        balance += amount;
    }

    public void Withdraw(int amount)
    {
        balance -= amount;
    }
}
