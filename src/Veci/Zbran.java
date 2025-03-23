package Veci;
import Mapa.Mistnost;
import Postavy.Hrac;
public class Zbran extends Predmet {
    public Zbran(String nazev) {
        super("Macete");
    }


    @Override
    public String pouziti(Mistnost m, Hrac h) {
        h.getInventar().remove(this);
        return "pokud chces pouzit zbran, musis ji pouzit s prikazem utok";

    }

    @Override
    public String toString() {
        return "Macete";
    }
}
