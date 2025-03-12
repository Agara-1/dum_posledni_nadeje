package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

public class Akumulatory extends Predmet {
    public Akumulatory(String nazev) {
        super(nazev);
    }

    public void puziti(){

    }

    @Override
    public String pouziti(Mistnost m, Hrac h) {
        if(m.getNazev().equals("Sklep")){
            return "pouzili jste akumulatory";
        }
        return "Zde nemuzes pouzit akumulatory";
    }
}
