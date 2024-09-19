package com.alexiae.poo;

import com.alexiae.poo.model.CurrentAccount;
import com.alexiae.poo.model.SavingAccount;
import com.alexiae.poo.model.TypeAccount;

public class PooApp {

  public static void main(String[] args) {
    SavingAccount savingAccount = new SavingAccount("123456789", TypeAccount.AHORROS, 1000,
        "test user 1", 5.0);
    savingAccount.deposit(500);
    savingAccount.withdraw(250);
    savingAccount.calculateInterest();
    System.out.println("**************************************************************");
    System.out.println("**************************************************************");
    CurrentAccount currentAccount = new CurrentAccount("987654321", TypeAccount.CORRIENTE, 600,
        "test user 2", 5.0);
    currentAccount.deposit(500);
    currentAccount.withdraw(200);
    currentAccount.withdraw(1500);
  }

}
