package com.alexiae.basic.syntax.data;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class Constants {

  private static final String[] NAMES = {
      "Juan", "María", "Pedro", "Lucía", "Carlos", "Ana", "Jorge", "Elena", "Luis", "Laura"
  };

  private static final String[] LASTNAMES = {
      "García", "Martínez", "Rodríguez", "López", "Pérez", "González", "Sánchez", "Ramírez",
      "Torres", "Vargas"
  };

  static Random random = new Random();

  public static final List<Customer> customers = Arrays.asList(
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble())),
      new Customer(NAMES[random.nextInt(NAMES.length)], LASTNAMES[random.nextInt(LASTNAMES.length)],
          new Account(generateDouble()))
  );


  public static double generateDouble() {
    return 0 + (1000 - 0) * random.nextDouble();
  }

  public static Action getAction() {
    int randomIndex = random.nextInt(Action.values().length);
    return Action.values()[randomIndex];
  }

  public static double generateAmount() {
    return 10 + (1400 - 10) * random.nextDouble();
  }

  public static int retry() {
    return random.nextInt(3) + 1;
  }

  private Constants() {
  }
}
