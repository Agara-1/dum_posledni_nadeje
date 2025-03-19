package Source;

import Command.*;
import Mapa.*;
import Postavy.*;
import Veci.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private boolean exit = false;
    private HashMap<String, Command> prikazy = new HashMap<>();
    private SvetovaMapa sm = new SvetovaMapa();
    private Scanner sc = new Scanner(System.in);

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

    Predmet akumulatory = new Akumulatory("Akumulatory");
    Predmet jidlo = new Jidlo("Konzerva");
    Predmet klice = new Klice("Klice");
    Predmet leky = new Leky("Leky");
    Predmet zbran  = new Zbran("Macete");

  obyvak.pridatPredmet(akumulatory);
  kuchyn.pridatPredmet(jidlo);
  koupelna1.pridatPredmet(klice);
  koupelna2.pridatPredmet(leky);
  pokoj1.pridatPredmet(zbran);

chodba.pridaniPostavy(lekarka);
kuchyn.pridaniPostavy(kucharka);
kuchyn.pridaniPostavy(psycholog);
sklep.pridaniPostavy(vedec);
obyvak.pridaniPostavy(vezen);



    prikazy.put("jdi", new Pohyb(sm, hrac));
    prikazy.put("mluv", new Mluv(hrac));
    prikazy.put("pruzkum", new Pruzkum(hrac));
    prikazy.put("vezmi", new Vezmi(hrac));
    prikazy.put("pouzij", new Pouzij(hrac));
    prikazy.put("utok", new Utok(hrac));
    prikazy.put("konec", new KonecHry(this));

}


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
    System.out.println(pribeh());
    inicializace();
    do{
        delejPrikaz();
    }while(!exit);

}

public void ukoncitHru() {
    exit = true;
}

    private String pribeh() {
    return "               **NOUZOVÉ HLÁŠENÍ** " +
            "   \nToto není cvičení! Byly odpáleny jaderné hlavice.\n" +
            "     Vyhledejte nejbližší kryt! Radiace se šíří...\n" +
            "     Opakujeme, okamžitě se ukryjte a nevycházejte ven!\n" +
            "\n" +
            "  \n           **SVĚT UŽ NENÍ, JAKÝ BÝVAL** " +
            "  \n Pár minut před výbuchem jsi vběhl do opuštěného domu.\n" +
            "     Slyšel jsi výbuch. Pak otřesy. A pak... ticho.\n" +
            "     Nejsi tu sám. Pět cizinců. Nikdo se nezná. Ale jeden z vás lže.\n" +
            "               \n **TVŮJ CÍL** \n" +
            "    ✔ Najdi zásoby a pokus se přežít.\n" +
            "    ✔ Sleduj ostatní. Někomu nemůžeš věřit.\n" +
            "    ✔ Odhal vraha dřív, než bude pozdě.\n" +
            "    ✔ Jsi zraněný, najdi léky a lékařku, a vedle ní, aby ti pomohla.\n " +
            "   ✔ Zapni rádio a poslechni vzkaz.\n" +
            "\n" +
            "                   \n **DOSTUPNÉ PŘÍKAZY**\n " +
            "      **jdi [místnost]** – Přesune tě do jiné místnosti.\n" +
            "      **pouzij [předmět]** – Použije předmět v místnosti nebo v inventáři.\n" +
            "      **pruzkum** – Prozkoumá místnost a zobrazí dostupné předměty.\n" +
            "      **utok [postava]** – Zaútočí na postavu v místnosti.\n" +
            "      **vezmi [předmět]** – Vezme předmět z místnosti do inventáře.\n" +
            "      **mluv [postava]** – Promluvíš si s postavou v místnosti.\n" +
            "\n" +
            "        \n❗ **Jednou může být příliš pozdě...** ❗\n" +
            "      **Vrah sleduje každý tvůj krok. Neudělej chybu.** " +
            "\n" +
            "        \n **Hra začíná…**\n ";

    }


}
