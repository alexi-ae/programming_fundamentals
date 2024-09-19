package com.alexiae.poo.utils;

import java.util.Random;

public final class Constants {


  static Random random = new Random();
  public static int LIMIT_WITHDRAWAL_MONTH = 5;
  public static double ADDITIONAL_TRX_FEE = 4.0;

  public static int trxCounter() {
    return random.nextInt(10) + 1;
  }

  private Constants() {
  }
}
