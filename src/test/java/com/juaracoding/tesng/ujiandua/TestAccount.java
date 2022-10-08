package com.juaracoding.tesng.ujiandua;

import com.juaracoding.ujiandua.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAccount {

    Account account;
    int a;
    String n;
    double amt;

    @BeforeMethod
    public void setUp() {
       account = new Account();
    }

    @Test
    @Parameters({"acc_no", "name", "amount"})
     public void testInsert(int acc_no, String name, double amount) {

        account.insert(acc_no, name, amount);
        Assert.assertEquals(acc_no,100900);
        Assert.assertEquals(name, "Mohammad Eko");
        Assert.assertEquals(amount, 1000.0);
    }

    @Test
    @Parameters({"amt", "amount"})
    public void testDeposit(double amt, double amount) {
        account.deposit(amount + amt);
        Assert.assertEquals(amt, 1000.0);
        Assert.assertEquals(amount, 1000.0);
    }

    @Test
    @Parameters({"amt", "amount"})
    public void testWithdraw(double amt, double amount) {
        account.withdraw(amount);
        Assert.assertEquals(amount, 1000.0);
    }

    @Test
    @Parameters({"amount", "amt"})
    public void testCheckBalance(double amount, double amt) {

        double hasil = amount +amt;
        account.checkBalance(hasil);
        Assert.assertEquals(hasil, 2000.0);
    }

    @Test
    @Parameters({"acc_no", "name", "amount", "amt"})
    public void testDisplay(int acc_no, String name, double amount, double amt) {

        double hasil = amount + amt;
        account.display(acc_no, name, hasil);
        Assert.assertEquals(acc_no, 100900);
        Assert.assertEquals(name, "Mohammad Eko");
        Assert.assertEquals(hasil, 2000.0);
    }
}
