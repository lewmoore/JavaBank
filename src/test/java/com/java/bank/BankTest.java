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

}
