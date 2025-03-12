package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

public abstract class Jidlo extends Predmet {
    public Jidlo(String nazev) {
        super("Ji dlo");
    }

    public void puziti(){

    }

    @Override
    public String pouziti(Mistnost m, Hrac h) {
        if(m.getNazev().equals("Kuchyn")){
            return "najedli jste se";
        }
        return "Zde neni jidlo";
    }
}
