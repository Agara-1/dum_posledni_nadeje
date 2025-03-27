package Veci;
import Mapa.Mistnost;
import Postavy.Hrac;

/**
 * Třída reprezentující zbraň jako předmět.
 */
public class Zbran extends Predmet {

    /**
     * Konstruktor pro vytvoření zbraně.
     */

    public Zbran(String nazev) {
        super("Macete");
    }

    /**
     * Použití zbraně.
     */

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
