package com.task3;

public class Account {
	private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }


public static void main(String[] args) {
    // Creating an account with no initial balance
    Account account1 = new Account();
    account1.displayBalance();

    // Creating an account with an initial balance of 1000
    Account account2 = new Account(1000);
    account2.displayBalance();

    // Depositing and withdrawing from the accounts
    account1.deposit(500);
    account2.withdraw(200);

    // Displaying the final balances
    account1.displayBalance();
    account2.displayBalance();
}
}

