package org.lessons.java.shop;

public class GestisciProdotto {

  public static void main(String[] args) {

    Prodotto product1 = new Prodotto();

    product1.setCodice();
    product1.nome = "cioccolato";
    product1.descrizione = "una tavolatta di cioccolato";
    product1.prezzo = 5.90;
    product1.iva = 1.22;

    System.out.println("Il nome completo di product1 è: " +
        product1.getNomeEsteso());
    System.out.println("Il prezzo senza iva è: €" + product1.getPrezzo());
    System.out.println("Il prezzo ivato è: €" + product1.getPrezzoIvato());
  }

}
