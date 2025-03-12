package Veci;
import Mapa.Mistnost;
import Postavy.Hrac;
public class Zbran extends Predmet {
    public Zbran(String nazev) {
        super("Macete");
    }

    public void puziti(){

    }

    @Override
    public String pouziti(Mistnost m, Hrac h) {
        return "pokud chces pouzit zbran, musis ji pouzit s prikazem utok";
    }
}
