package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

public class  Klice extends Predmet {
   public Klice(String nazev) {
      super("Klic");
   }

   public void puziti(){

   }

   @Override
   public String pouziti(Mistnost m, Hrac h) {
      if (m.getNazev().equals("Pokoj1")) {
         return "Odemkl jsi trezor!";
      }
      return "Tady tenhle klíč nejde pouzit.";
   }
}
