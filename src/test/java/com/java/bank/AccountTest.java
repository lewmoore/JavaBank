package com.java.bank;

import static org.junit.Assert.assertTrue;
import org.assertj.core.api.Assertions;

import org.junit.Test;

public class AccountTest
{
    Account account = new Account();
    @Test
    public void ShouldCreateNewAccount()
    {
        Assertions.assertThat(account).isInstanceOf(Account.class);
    }

    @Test
    public void UserCanDepositMoney()
    {
        account.Deposit(10);
        Assertions.assertThat(account.balance).isEqualTo(10);
    }

    @Test
    public void UserAccountHasInitialBalanceOfZero()
    {
        Assertions.assertThat(account.balance).isEqualTo(0);
    }
}
