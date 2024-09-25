package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

  int codice;
  String nome;
  String descrizione;
  double prezzo;
  double iva;

  void setCodice() {
    Random numRandom = new Random();
    codice = numRandom.nextInt();
  }

  double getPrezzo() {
    return prezzo;
  }

  String getPrezzoIvato() {
    return String.format("%.2f", (prezzo * iva));
  }

  String getNomeEsteso() {
    return codice + nome;
  }

}
