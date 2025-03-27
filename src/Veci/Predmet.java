package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;
import Postavy.Hrac;

/**
 * Abstraktní třída reprezentující předměty ve hře.
 */
public abstract class  Predmet {
    protected String nazev;

    public Predmet(String nazev) {
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }

    /**
     * Abstraktní metoda pro použití předmětu.
     */
        public abstract String pouziti(Mistnost m, Hrac h);


}
