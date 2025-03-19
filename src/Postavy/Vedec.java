package Postavy;

import Mapa.Mistnost;

import java.util.ArrayList;

public class Vedec extends Postava {
    public Vedec(String jmeno, String povolani, String text, Mistnost mistnost) {
        super( "Rober", text, mistnost);
    }

    @Override
    public String toString() {
        return "Vedec";
    }

    @Override
    protected String[] getHlasky() {
        return new String[]{
                "Tahle katastrofa byla nevyhnutelná… lidstvo si za to může samo.",
                "Mám teorii, že radiace v některých místech není tak silná, jak si myslíme.",
                "Jestli tu zůstaneme moc dlouho, naše DNA se může změnit… ne k lepšímu.",
                "Hele, psycholog se mi nezdá. Viděl jsem lidi jako on… něco skrývá."
        };
    }
}
