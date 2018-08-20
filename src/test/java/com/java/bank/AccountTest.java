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
}
