package com.virtusa.JavaOOP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {

    private SavingsAccount savingsAccount;
    private CurrentAccount currentAccount;

    @BeforeEach
    public void setUp() {
        // Initialize SavingsAccount and CurrentAccount objects
        savingsAccount = new SavingsAccount("SBI00080", 12345, 1.5);
        currentAccount = new CurrentAccount("YES00010", 15000, 0);
    }

    @Test
    public void testSavingsAccountDetails() {
        // Test savings account details before interest calculation
        System.out.println("Savings Account Details are: ");
        savingsAccount.displayDetails();
        assertEquals("SBI00080", savingsAccount.getAccountNumber());
        assertEquals(12345, savingsAccount.getBalance());
        assertEquals(1.5, savingsAccount.getInterestRate());
    }

    @Test
    public void testCalculateInterestSavingsAccount() {
        // Calculate and verify interest for savings account
        savingsAccount.calculateInterest();
        // Assuming calculateInterest modifies balance by some factor based on interest rate
        double expectedBalance = 12345 + (12345 * 1.5 / 100);  // assuming interest is added to balance
        assertEquals(expectedBalance, savingsAccount.getBalance(), 0.01);
    }

    @Test
    public void testCurrentAccountDetails() {
        // Test current account details before interest calculation
        System.out.println("Current Account Details are :");
        currentAccount.displayDetails();
        assertEquals("YES00010", currentAccount.getAccountNumber());
        assertEquals(15000, currentAccount.getBalance());
        assertEquals(0, currentAccount.getInterestRate());
    }

    @Test
    public void testCalculateInterestCurrentAccount() {
        // Calculate and verify interest for current account
        currentAccount.calculateInterest();
        // Since interest rate is 0, balance should remain unchanged
        assertEquals(15000, currentAccount.getBalance());
    }

    @Test
    public void testSavingsAccountAfterInterestCalculation() {
        // Verify if the details are updated after interest is calculated for savings account
        savingsAccount.calculateInterest();
        savingsAccount.displayDetails();
        assertTrue(savingsAccount.getBalance() > 12345);  // balance should increase
    }

    @Test
    public void testCurrentAccountAfterInterestCalculation() {
        // Verify if the details are updated after interest is calculated for current account
        currentAccount.calculateInterest();
        currentAccount.displayDetails();
        assertEquals(15000, currentAccount.getBalance());  // balance should remain the same
    }
}
