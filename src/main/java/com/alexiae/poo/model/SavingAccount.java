package com.alexiae.poo.model;

import com.alexiae.poo.service.TransactionService;
import com.alexiae.poo.utils.Constants;

public class SavingAccount extends BankAccount implements TransactionService {

  private double interestRatePercentage;

  public SavingAccount(String number, TypeAccount type, double balance, String clientName,
      double interestRatePercentage) {
    super(number, type, balance, clientName);
    this.interestRatePercentage = interestRatePercentage;
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
    int counter = Constants.trxCounter();
    if (Constants.LIMIT_WITHDRAWAL_MONTH < counter) {
      System.out.println("LIMIT_WITHDRAWAL_MONTH: " + Constants.LIMIT_WITHDRAWAL_MONTH
          + " - customer withdrawal counter: " + counter);
      System.out.println("The monthly withdrawal limit was exceeded");
      System.out.println("withdrawal fee will be charged: " + Constants.ADDITIONAL_TRX_FEE);
      amount = amount + Constants.ADDITIONAL_TRX_FEE;
    }
    if (this.getBalance() >= amount) {
      this.setBalance(this.getBalance() - amount);
      System.out.println("New Balance: " + this.getBalance());
    } else {
      System.out.println("Insufficient balance in your account");
    }
    System.out.println("End withdraw");
  }

  public void calculateInterest() {
    double interest = this.getBalance() * interestRatePercentage / 100;
    deposit(interest);
    System.out.println("Interés calculado y depositado: " + interest);
  }
}
