package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

public class Jidlo extends Predmet {
    public Jidlo(String nazev) {
        super("Konzerva");
    }



    @Override
    public String pouziti(Mistnost m, Hrac h) {
        m = h.getMojePozice();
        if(m.getNazev().equals("Kuchyn")){
            return "najedli jste se";

        }
        h.getInventar().remove(this);
        return "Zde neni jidlo";
    }

    @Override
    public String toString() {
        return "Konzervu";
    }
}
