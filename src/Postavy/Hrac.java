package Postavy;

import Mapa.Mistnost;
import Veci.Akumulatory;
import Veci.Predmet;

import java.util.ArrayList;

public class Hrac {

    private String jmeno;

    private ArrayList<Predmet> inventar;
    private int hp;
    private Mistnost mojePozice;

    public Hrac(String jmeno, Mistnost start) {
        this.jmeno = jmeno;
        this.inventar = new ArrayList<Predmet>();
        this.hp = 80;
        this.mojePozice = start;
    }

    public Hrac() {
        this.inventar = new ArrayList<Predmet>();
        this.hp = 80;
    }

    public Mistnost getMojePozice() {
        return mojePozice;
    }

    public void setMojePozice(Mistnost mistnost) {
        this.mojePozice = mistnost;
    }


    public int getHp() {
        return hp;
    }

    public void vzitPredmet(Predmet p) {
        inventar.add(p);
    }


    public void vylecit(int hodnota) {
        this.hp = Math.min(100, this.hp + hodnota);
    }


    public ArrayList<Predmet> getInventar() {
        return inventar;
    }


}
