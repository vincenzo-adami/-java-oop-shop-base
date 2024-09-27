package org.lessons.java.shop;

public class GestisciProdotto {

  public static void main(String[] args) {

    Prodotto product1 = new Prodotto();
    product1.setNome("cioccolato");
    product1.setDescrizione("una tavolatta di cioccolato");
    product1.setPrezzo(5.90);

    Prodotto product2 = new Prodotto("patatine", "patatine San Carlo classiche");
    product2.setPrezzo(3);
    product2.setIva(0.05);

    System.out.println("Il nome completo di product1 è: " +
        product1.getNomeEsteso());
    System.out.println("Il prezzo senza iva è: €" + product1.getPrezzo());
    System.out.println("Il prezzo ivato è: €" + product1.getPrezzoIvato());

    System.out.println("il product2 è: " + product2.getNomeEsteso());
    System.out.println("Il prezzo ivato è: €" + product2.getPrezzoIvato());
  }

}
