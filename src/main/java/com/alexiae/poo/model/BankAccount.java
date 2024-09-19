package com.alexiae.poo.model;

public class BankAccount {

  private String number;
  private TypeAccount type;
  private double balance;
  private String clientName;

  public BankAccount(String number, TypeAccount type, double balance, String clientName) {
    System.out.println("**************NEW ACCOUNT*************************");
    this.number = number;
    this.type = type;
    this.balance = balance;
    this.clientName = clientName;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public TypeAccount getType() {
    return type;
  }

  public void setType(TypeAccount type) {
    this.type = type;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

}
