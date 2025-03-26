package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

//Třída reprezentující klíče, které lze použít k otevření trezoru.
public class  Klice extends Predmet {


   public Klice(String nazev) {
      super("Klice");
   }

//Použití klíče v aktuální místnosti hráče.
   @Override
   public String pouziti(Mistnost m, Hrac h) {
      m = h.getMojePozice();
      if (m.getNazev().equals("Pokoj1")) {
         h.getInventar().remove(this);
         m.otevritTrezor();
         return "Odemkl jsi trezor!";

      }

      return "Tady tenhle klíč nejde pouzit.";
   }

   @Override
   public String toString() {
      return "Klice";
   }
}
