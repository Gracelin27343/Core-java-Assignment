package com.gracelin.assignment3;

public final class Transaction {

	private final double transactionFee = 10.0;

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nTransaction Start...");
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee); // Apply fee on withdrawal
        } else {
            System.out.println("Invalid transaction type.");
        }
        System.out.println("Transaction complete. Current balance: " + account.getBalance());
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
