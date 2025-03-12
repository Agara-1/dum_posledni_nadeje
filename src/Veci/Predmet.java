package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;
import Postavy.Hrac;

public abstract class  Predmet {
    protected String nazev;

    public Predmet(String nazev) {
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }
    public abstract String pouziti(Mistnost m, Hrac h);


}
