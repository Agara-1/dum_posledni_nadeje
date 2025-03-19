package Postavy;

import Mapa.Mistnost;

import java.util.ArrayList;

public class Lekarka extends Postava {

    public Lekarka(String jmeno, String povolani, String text, Mistnost mistnost) {
        super(jmeno, text, mistnost);
    }

    @Override
    public String toString() {
        return "Lekarka" ;
    }

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
