package Postavy;

import Mapa.Mistnost;

import java.util.ArrayList;

public class Psycholog extends Postava {
    public Psycholog(String jmeno, String povolani, String text, Mistnost mistnost) {
        super("Petr", text, mistnost);
    }

    @Override
    public String toString() {
        return "Psycholog";
    }

    @Override
    protected String[] getHlasky() {
        return new String[]{
                "Jak se cítíš? Tohle místo může být psychicky náročné.",
                "Neboj se mi svěřit… každý má své tajemství.",
                "Lidé se tady chovají zvláštně… nikdy nevíš, komu můžeš věřit.",
                "Občas mám pocit, že někdo tady něco skrývá… ale kdo?"
        };
    }
}
