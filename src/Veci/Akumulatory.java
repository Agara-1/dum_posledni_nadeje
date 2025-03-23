package Veci;
import Postavy.Hrac;
import Mapa.Mistnost;

public class Akumulatory extends Predmet {
    public static boolean radioZapnuto = false;

    public Akumulatory(String nazev) {
        super(nazev);
    }



    @Override
    public String pouziti(Mistnost m, Hrac h) {
        m = h.getMojePozice();
        if (m.getNazev().equals("Sklep")) {
            radioZapnuto = true;
            return """
            Zapojil jsi akumulátory... 
            Rádio ožívá a z repráků se ozývá statický šum. 
            Po chvíli se v éteru objeví zkreslený hlas: 

            "Tady nouzový vysílač vlády. Pokud nás slyšíte, zachovejte klid. 
            Evakuační jednotky dorazí do vaší oblasti za měsíc. 
            Vyhněte se konfliktům, šetřete zásoby... a nevěřte každému, koho potkáte. 
            Hodně štěstí. Přenos končí."

            Rádio znovu utichlo. Naděje nebo jen další past? 
            """;
        }
        h.getInventar().remove(this);
        return "Zde nemůžeš použít akumulátory.";
    }

    @Override
    public String toString() {
        return "Akumulatory";
    }
}
