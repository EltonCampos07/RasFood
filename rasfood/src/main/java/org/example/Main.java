package org.example;

import br.com.rasmoo.restaurante.entity.Prato;

public class Main {
  public static void main(String[] args) {
    var prato = new Prato();

    System.out.println("Hello and welcome!");

    for (int i = 1; i <= 5; i++) {
      System.out.println("i = " + i);
    }
  }
}