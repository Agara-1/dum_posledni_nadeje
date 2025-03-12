package Postavy;

import Mapa.Mistnost;
import Mapa.SvetovaMapa;

import javax.sound.midi.MidiSystem;
import java.util.ArrayList;

public abstract class Postava {
    protected String jmeno;
    protected String povolani;
    protected String text;
    protected Mistnost mistnost;
    private SvetovaMapa sm ;


    public Postava(String jmeno, String povolani, String text, Mistnost mistnost) {
        this.jmeno = jmeno;
        this.povolani = povolani;
        this.text = text;
        this.mistnost = mistnost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPovolani() {
        return povolani;
    }

    public String getText() {
        return text;
    }



    public void rozhovor(){
    }
}
