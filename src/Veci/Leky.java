package Veci;
import Mapa.Mistnost;
import Postavy.Hrac;


//Třída představující léky, které může hráč použít k obnovení svého zdraví.
public class Leky extends Predmet {
    public Leky(String nazev) {
        super("Leky");
    }

//Použití léků hráčem.
//Léky lze použít pouze v místnosti "Chodba" a pokud hráč nemá plné HP.
    @Override
    public String pouziti(Mistnost m, Hrac h) {
        m = h.getMojePozice();
        if (h.getHp() < 100 && m.getNazev().equals("Chodba")) {
            h.vylecit(20);
            h.getInventar().remove(this);
            return "Lekárka si tě všimla a bez váhání ti pomohla použit léky." +
                    "Použili jste léky, teď máte o 20 HP více. Aktuální HP: " + h.getHp();
        }
        return "Tvoje HP je plné.";
    }

    @Override
    public String toString() {
        return "Leky";
    }
}

