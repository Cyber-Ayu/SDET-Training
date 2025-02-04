package com.compAssignment.JavaOOP;

public class TestAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 10000, 3.5);
        System.out.println("Savings Account Details:");
        savingsAccount.displayDetails();
        savingsAccount.calculateInterest();
        savingsAccount.displayDetails();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount("CA67890", 15000, 0);
        System.out.println("Current Account Details:");
        currentAccount.displayDetails();
        currentAccount.calculateInterest();
        currentAccount.displayDetails();
    }
}
