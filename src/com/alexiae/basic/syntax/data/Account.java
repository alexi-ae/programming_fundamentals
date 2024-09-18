package com.alexiae.basic.syntax.data;

public class Account {

  private static int counter = 0;

  private int id;
  private double amount;

  public Account(double amount) {
    this.id = ++counter;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
