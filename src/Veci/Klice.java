package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

public class  Klice extends Predmet {


   public Klice(String nazev) {
      super("Klice");
   }

   public void puziti(){

   }

   @Override
   public String pouziti(Mistnost m, Hrac h) {
      m = h.getMojePozice();
      if (m.getNazev().equals("Pokoj1")) {
       //  m.otevritTrezor();
         return "Odemkl jsi trezor!";

      }

      return "Tady tenhle klíč nejde pouzit.";
   }

   @Override
   public String toString() {
      return "Klice";
   }
}
