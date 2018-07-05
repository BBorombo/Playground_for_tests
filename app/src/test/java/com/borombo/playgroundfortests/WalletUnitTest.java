package com.borombo.playgroundfortests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_CreateWallet(){
        Wallet wallet = new Wallet(42);
        assertEquals(42, wallet.getBalance(), 0.001);
    }

    @Test
    public void test_DepositMoney(){
        Wallet wallet = new Wallet(0);
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), 0.001);
    }

    @Test
    public void test_WithdrawMoney(){
        Wallet wallet = new Wallet(100);
        wallet.withdraw(50);
        assertEquals(50, wallet.getBalance(), 0.001);
    }
}
