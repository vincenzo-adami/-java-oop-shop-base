package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

  private int codice;
  private String nome;
  private String descrizione;
  private double prezzo;
  private double iva;

  Prodotto() {
    Random numRandom = new Random();
    codice = numRandom.nextInt();
    setIva(0.22);
  }

  Prodotto(String nome, String descrizione) {
    this();
    this.nome = nome;
    this.descrizione = descrizione;
  }

  int getCodice() {
    return codice;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
  }

  public double getPrezzo() {
    return prezzo;
  }

  public void setIva(double iva) {
    if (iva == 0.04 || iva == 0.05 || iva == 0.1 || iva == 0.22) {
      this.iva = iva;
    } else {
      System.out.println("Valore d'iva inesistente, inserirne un altro");
    }
  }

  public double getIva() {
    return iva;
  }

  public String getPrezzoIvato() {
    return String.format("%.2f", (prezzo + (prezzo * iva)));
  }

  public String getNomeEsteso() {
    return codice + "-" + nome;
  }

}
