package Veci;
import Mapa.Mistnost;
import Postavy.Hrac;
public class Leky extends Predmet {
    public Leky(String nazev) {
        super("Leky");
    }


    @Override
    public String pouziti(Mistnost m, Hrac h) {
        if (h.getHp() < 100){
            h.vylecit(20);
            h.getPredmety().remove(this);
            return "Pouzili jste leky ted mate o 20 hp vice" + h.getHp();
        }
           return "Tvoje hp je plne ";
    }
}
