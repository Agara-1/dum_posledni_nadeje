package Postavy;

import Mapa.Mistnost;
import Mapa.SvetovaMapa;

import javax.sound.midi.MidiSystem;
import java.util.ArrayList;
import java.util.Random;

public abstract class Postava {

    private String jmeno;
    private String povolani;
    private Random rnd = new Random();
    private Mistnost mistnost;

    public Postava(String jmeno, String popis, Mistnost mistnost) {
        this.jmeno = jmeno;
        this.povolani = povolani;
        this.mistnost = mistnost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public Mistnost getMistnost() {
        return mistnost;
    }

    public String mluv() {
        String[] hlasky = getHlasky();
        return hlasky[rnd.nextInt(hlasky.length)];

    }
    protected abstract String[] getHlasky();

}
