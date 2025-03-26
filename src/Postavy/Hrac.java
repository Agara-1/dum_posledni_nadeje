package Postavy;

import Mapa.Mistnost;
import Veci.Akumulatory;
import Veci.Predmet;
import Veci.Zbran;

import java.util.ArrayList;

//Třída reprezentující hráče ve hře.
// * Hráč má jméno, životy, inventář a aktuální pozici ve hře (mistnost).
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

//Získá aktuální místnost, ve které se hráč nachází.
    public Mistnost getMojePozice() {
        return mojePozice;
    }

    //Nastaví novou pozici hráče, tedy novou místnost, do které se hráč přesune.
    public void setMojePozice(Mistnost mistnost) {
        this.mojePozice = mistnost;
    }
//Získá aktuální zdraví hráče.
    public int getHp() {
        return hp;
    }
//Přidá předmět do inventáře hráče.
    public void vzitPredmet(Predmet p) {
        inventar.add(p);
    }

//Vylečí hráče, přičemž maximální zdraví je 100.
    public void vylecit(int hodnota) {
        this.hp = Math.min(100, this.hp + hodnota);
    }

//Získá inventář hráče, tedy seznam předmětů, které má u sebe.
    public ArrayList<Predmet> getInventar() {
        return inventar;
    }


}
