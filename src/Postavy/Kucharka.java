package Postavy;

import Mapa.Mistnost;

import java.util.ArrayList;

public class Kucharka extends Postava {
    public Kucharka(String jmeno, String povolani, String text, Mistnost mistnost) {
        super(jmeno,  text, mistnost);
    }

    @Override
    public String toString() {
        return "Kucharka";
    }

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
