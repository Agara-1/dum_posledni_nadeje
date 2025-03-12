package Postavy;

import Mapa.Mistnost;

import java.util.ArrayList;

public class Lekarka extends Postava {

    public Lekarka(String jmeno, String povolani, String text, Mistnost mistnost) {
        super(jmeno, povolani, text, mistnost);
    }

    @Override
    public String toString() {
        return "Lekarka" ;
    }
}
