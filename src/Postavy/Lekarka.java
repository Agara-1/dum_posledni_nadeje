package Postavy;

import Mapa.Mistnost;

import java.util.ArrayList;

/**
 * Třída reprezentující postavu lékařky ve hře.
 * Lékařka je typ postavy, která může hráči nabídnout informace nebo pomoc.
 */
public class Lekarka extends Postava {

    public Lekarka(String jmeno, String povolani, String text, Mistnost mistnost) {
        super(jmeno, text, mistnost);
    }

    @Override
    public String toString() {
        return "Lekarka" ;
    }

    /**
     * Vrací pole hlášek, které lékařka může říct během hry.
     */

    @Override
    protected String[] getHlasky() {
        return new String[]{
                "Jak se cítíš? Pokud máš zranění, mohu ti pomoci.",
                "Drž se dál od problémů, nechci tě tu léčit každý den.",
                "Měli bychom najít víc léků… zásoby se tenčí.",
                "Psycholog se pořád ptá na naše obavy… ale nikdy neřekne nic o sobě. To mi nesedí."
        };
    }
}
