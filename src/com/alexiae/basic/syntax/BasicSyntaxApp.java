package com.alexiae.basic.syntax;

import com.alexiae.basic.syntax.data.Action;
import com.alexiae.basic.syntax.data.Constants;
import com.alexiae.basic.syntax.data.Customer;

public class BasicSyntaxApp {

  public static void main(String[] args) {

    for (Customer customer : Constants.customers) {
      System.out.println("************************************");
      Action action = Constants.getAction();
      double amount = Constants.generateAmount();
      processByAction(customer, action, amount);
    }
  }

  private static void processByAction(Customer customer, Action action, double amount) {
    System.out.println("Customer id=" + customer.getId() + " fullName=" + customer.getName() + " "
        + customer.getLastName() + " action=" + action.name());
    switch (action) {
      case DEPOSIT -> methodDeposit(customer, amount);
      case WITHDRAWAL -> methodWithdrawal(customer, amount);
      case CONSULT -> methodConsult(customer);
      case OTHER -> methodOther();
    }
  }

  private static void methodOther() {
    System.out.println("Start method Other");
    System.out.println("Invalid option, try another time.");
    System.out.println("End method Other");
  }

  private static void methodConsult(Customer customer) {
    System.out.println("Start method Consult");
    while (Constants.retry() < 2) {
      System.out.println("Check Account Balance...");
    }
    System.out.println("Account: " + customer.getAccount().getId());
    System.out.println("Account Balance: " + customer.getAccount().getAmount());
    System.out.println("End method Consult");
  }

  private static void methodWithdrawal(Customer customer, double amount) {
    System.out.println("Start method Withdrawal");
    System.out.println("Current Amount: " + customer.getAccount().getAmount());
    System.out.println("Amount to Withdrawal: " + amount);
    if (customer.getAccount().getAmount() >= amount) {
      customer.getAccount().setAmount(customer.getAccount().getAmount() - amount);
      System.out.println("New Amount: " + customer.getAccount().getAmount());
    } else {
      System.out.println("Insufficient Balance: " + customer.getAccount().getAmount());
    }
    System.out.println("End method Withdrawal");
  }

  private static void methodDeposit(Customer customer, double amount) {
    System.out.println("Start method Deposit");
    System.out.println("Current Amount: " + customer.getAccount().getAmount());
    System.out.println("Amount to Deposit: " + amount);
    customer.getAccount().setAmount(customer.getAccount().getAmount() + amount);
    System.out.println("New Amount: " + customer.getAccount().getAmount());
    System.out.println("End method Deposit");
  }
}
