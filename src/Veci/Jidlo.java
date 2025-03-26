package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

// Třída reprezentující jídlo v inventáři.
public class Jidlo extends Predmet {
    public Jidlo(String nazev) {
        super("Konzerva");
    }

//Metoda pro použití jídla.
//Pokud je hráč v místnosti "Kuchyn", jídlo je použito a hráč se nají.
    @Override
    public String pouziti(Mistnost m, Hrac h) {
        m = h.getMojePozice();
        if(m.getNazev().equals("Kuchyn")){
            h.getInventar().remove(this);
            return "najedli jste se";

        }

        return "Zde neni jidlo";
    }

    @Override
    public String toString() {
        return "Konzervu";
    }
}
