package com.gracelin.assignment3;

//SavingsAccount subclass
public class SavingsAccount extends Account {

public SavingsAccount(String accountHolder, double initialBalance) {
   super(accountHolder, initialBalance);
}

@Override
public void deposit(double amount) {
   balance += amount;
}

@Override
public void withdraw(double amount) {
   if (amount <= balance) {
       balance -= amount;
   } else {
       System.out.println("Insufficient funds in Savings Account.");
   }
}

@Override
public double getBalance() {
   return balance;
}
}