package Postavy;

import Mapa.Mistnost;
import Veci.Predmet;

import java.util.ArrayList;

public class Hrac {
     private String jmeno;
     private String povolani;
     private ArrayList<Predmet> inventar;
     private int hp;
     private Mistnost mojePozice;


    public Hrac(String jmeno, Mistnost start) {
        this.jmeno = jmeno;
        this.povolani = povolani;
        this.inventar = new ArrayList<>();
        this.hp = 100;
        this.mojePozice = start;
    }

    public Hrac() {
    }


    public Mistnost getMojePozice() {
        return mojePozice;
    }

    public void setMojePozice(Mistnost mistnost) {
        this.mojePozice = mistnost;
    }

    public String getJmeno() {
        return jmeno;
    }


    public int getHp() {
        return hp;
    }


    public void vzitPredmet(Predmet p) {
        inventar.add(p);
     }

    public void vylecit(int hodnota ){
        this.hp = Math.min(100, this.hp + hodnota);
    }

    public ArrayList<Predmet> getPredmety() {
         return inventar;
    }


}
