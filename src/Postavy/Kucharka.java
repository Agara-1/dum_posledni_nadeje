package Postavy;

import Mapa.Mistnost;


//Třída reprezentující postavu kuchařky ve hře.
//Kuchařka je typ postavy, která se nachází v určité místnosti a má připravené repliky, které pronáší, když s ní hráč komunikuje.
public class Kucharka extends Postava {
    public Kucharka(String jmeno, String povolani, String text, Mistnost mistnost) {
        super(jmeno,  text, mistnost);
    }

    @Override
    public String toString() {
        return "Kucharka";
    }
//Vrací pole hlášek, které kuchařka může říct během hry.
    @Override
    protected String[] getHlasky() {
        return new String[]{
                "Ahoj, tady máš jídlo, vezmi si ho.",
                "Dneska jsem uvařila něco speciálního… doufám, že ti bude chutnat.",
                "Už mi dochází zásoby, snad to do příštího týdne vydržíme.",
                "Víš, Psycholog moc nejí s námi... pořád je někde sám. Není to zvláštní?"
        };

    }
}
