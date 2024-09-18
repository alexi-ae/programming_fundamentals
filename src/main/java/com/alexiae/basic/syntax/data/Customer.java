package com.alexiae.basic.syntax.data;

public class Customer {

  private static int counter = 0;

  private int id;
  private String name;
  private String lastName;
  private Account account;

  public Customer(String name, String lastName, Account account) {
    this.id = ++counter;
    this.name = name;
    this.lastName = lastName;
    this.account = account;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}
