package Postavy;

import Mapa.Mistnost;
import java.util.Random;

//Abstraktní třída reprezentující základní vlastnosti a chování postavy.
//Postavy se nacházejí v místnostech, mají jméno a mohou s hráčem mluvit.
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
//Vrací náhodnou hlášku postavy.
    public String mluv() {
        String[] hlasky = getHlasky();
        return hlasky[rnd.nextInt(hlasky.length)];

    }

    //Abstraktní metoda pro definování hlášek postavy.
    protected abstract String[] getHlasky();

}
