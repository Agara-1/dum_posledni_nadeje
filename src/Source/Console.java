package Source;

import Command.*;
import Mapa.*;
import Postavy.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private boolean exit = false;
    private HashMap<String, Command> prikazy = new HashMap<>();
    private SvetovaMapa sm = new SvetovaMapa();


public void inicializace(){

    Mistnost chodba  = sm.getMistnost("Chodba");
    Mistnost sklep  = sm.getMistnost("Sklep");
    Mistnost kuchyn  = sm.getMistnost("Kuchyn");
    Mistnost obyvak  = sm.getMistnost("Obyvak");
    Mistnost koupelna1  = sm.getMistnost("Koupelna1");
    Mistnost koupelna2  = sm.getMistnost("Koupelna2");
    Mistnost pokoj1  = sm.getMistnost("Pokoj1");
    Mistnost pokoj2  = sm.getMistnost("Pokoj2");
    Hrac hrac = new Hrac("Hrac",sm.getMistnost("Chodba"));
Lekarka lekarka = new Lekarka("Eva", "Lekarka", "text", chodba);
Kucharka kucharka = new Kucharka("Klara", "Kucharka", "text", kuchyn);
Psycholog psycholog = new Psycholog("Petr", "Psycholog", "text", kuchyn);
Vedec vedec = new Vedec("Robert", "Vedec", "text", sklep);
Vezen vezen = new Vezen("Jack", "Vezen", "text", obyvak);

chodba.pridaniPostavy(lekarka);
kuchyn.pridaniPostavy(kucharka);
kuchyn.pridaniPostavy(psycholog);
sklep.pridaniPostavy(vedec);
obyvak.pridaniPostavy(vezen);
    Scanner sc = new Scanner(System.in);
    prikazy.put("jdi", new Pohyb(sm, hrac));
    prikazy.put("mluv", new Mluv(hrac));
    prikazy.put("pruzkum", new Pruzkum(hrac));
    prikazy.put("vezmi", new Vezmi(hrac));
    prikazy.put("pouzij", new Pouzij(hrac));
    prikazy.put("utok", new Utok(hrac));
    prikazy.put("konec", new KonecHry(this));

}
private Scanner sc = new Scanner(System.in);

public void delejPrikaz() throws IOException {
    System.out.println(sm.getSvet());
    System.out.println(">>");
    String command = sc.nextLine();
    command = command.toLowerCase();
    command = command.trim();
    if(prikazy.containsKey(command)){
        System.out.println( prikazy.get(command).execute());

    }else {
        System.out.println("Neznamy prikaz");
    }
}

public void start() throws IOException {
    inicializace();
    do{
        delejPrikaz();
    }while(!exit);

}

public void ukoncitHru() {
    exit = true;
}
}
