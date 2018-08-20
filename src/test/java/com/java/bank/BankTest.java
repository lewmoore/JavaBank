package com.java.bank;

import org.junit.jupiter.api.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BankTest {

    Bank bank = new Bank();

    @Test
    public void ShouldBeAnInstanceOfBank()
    {
        Assertions.assertThat(bank).isInstanceOf(Bank.class);
    }

    @Test
    public void BankHasArrayOfAllAccounts()
    {
        Assertions.assertThat(bank.accountList).isEmpty();
    }

    @Test
    public void CreatesNewAccount()
    {
        bank.CreateAccount();
        Assertions.assertThat(bank.accountList).hasSize(1);
    }
}
