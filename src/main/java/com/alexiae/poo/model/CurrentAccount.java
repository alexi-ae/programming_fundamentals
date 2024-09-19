package com.alexiae.poo.model;

import com.alexiae.poo.service.TransactionService;

public class CurrentAccount extends BankAccount implements TransactionService {

  private double overdraftFeePercentage;

  public CurrentAccount(String number, TypeAccount type, double balance, String clientName,
      double overdraftFeePercentage) {
    super(number, type, balance, clientName);
    this.overdraftFeePercentage = overdraftFeePercentage;
  }

  @Override
  public void deposit(double amount) {
    System.out.println("************************************");
    System.out.println(
        " Start deposit - Client: " + this.getClientName() + " Account: " + this.getNumber()
            + " type: " + this.getType().name() + " Balance: " + this.getBalance() + " Amount: "
            + amount);
    System.out.println("Balance: " + this.getBalance());
    System.out.println("Deposit: " + amount);
    this.setBalance(this.getBalance() + amount);
    System.out.println("New Balance: " + this.getBalance());
    System.out.println("End deposit");
  }

  @Override
  public void withdraw(double amount) {
    System.out.println("************************************");
    System.out.println(
        " Start withdraw - Client: " + this.getClientName() + " Account: " + this.getNumber()
            + " type: " + this.getType().name() + " Balance: " + this.getBalance() + " Amount: "
            + amount);
    System.out.println("Balance: " + this.getBalance());
    System.out.println("Withdraw: " + amount);
    if (this.getBalance() >= amount) {
      this.setBalance(this.getBalance() - amount);
      System.out.println("New Balance: " + this.getBalance());
    } else {
      System.out.println("Insufficient balance in your account");
      double overdraftFee = (amount - this.getBalance()) * (this.overdraftFeePercentage / 100);
      System.out.println(
          "To continue, an overdraft fee will be charged: " + overdraftFee);
      amount = amount + overdraftFee;
      this.setBalance(this.getBalance() - amount);
    }
    System.out.println("End withdraw");
  }
}
