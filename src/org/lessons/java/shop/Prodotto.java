package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

  private int codice;
  private String nome;
  private String descrizione;
  private double prezzo;
  private double iva;

  Prodotto() {
    setCodice();
    setIva(0.22);
  }

  Prodotto(String nome, String descrizione) {
    this();
    this.nome = nome;
    this.descrizione = descrizione;
  }

  private void setCodice() {
    Random numRandom = new Random();
    codice = numRandom.nextInt();
  }

  int getCodice() {
    return codice;
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return nome;
  }

  void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  String getDescrizione() {
    return descrizione;
  }

  void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
  }

  double getPrezzo() {
    return prezzo;
  }

  void setIva(double iva) {
    if (iva == 0.04 || iva == 0.05 || iva == 0.1 || iva == 0.22) {
      this.iva = iva;
    }
  }

  double getIva() {
    return iva;
  }

  String getPrezzoIvato() {
    return String.format("%.2f", (prezzo + (prezzo * iva)));
  }

  String getNomeEsteso() {
    return codice + "-" + nome;
  }

}
