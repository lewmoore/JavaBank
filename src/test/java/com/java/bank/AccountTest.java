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

    @Test
    public void UserCanWithdrawFromAccount()
    {
        account.Deposit(50);
        account.Withdraw(25);
        Assertions.assertThat(account.balance).isEqualTo(25);
    }

    @Test
    public void UserCantWithdrawMoreThanBalance()
    {
        account.Deposit(10);
        Assertions.assertThat(account.Withdraw(20)).isEqualTo("You don't have enough money");
    }

    @Test
    public void UserCanTransferToAnotherAccount(){
        {
            Account anotherAccount = new Account();
            account.Deposit(100);
            account.Transfer(50, anotherAccount);
            Assertions.assertThat(account.balance).isEqualTo(50);
            Assertions.assertThat(anotherAccount.balance).isEqualTo(50);
        }
    }
}
