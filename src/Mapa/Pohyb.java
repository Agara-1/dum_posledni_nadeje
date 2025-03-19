package Mapa;

import Command.Command;
import Postavy.Hrac;

import java.util.Scanner;



public class Pohyb implements Command {
    private Scanner sc = new Scanner(System.in);
    private SvetovaMapa sm;
    private Hrac hrac;

    public Pohyb(SvetovaMapa sm, Hrac hrac) {
        this.sm = sm;
        this.hrac = hrac;
    }

    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
        System.out.println("Teď jsi v: " + mojePozice);
        System.out.println("Možné směry: " + sm.sousedniMistnost(mojePozice));
        System.out.print("Kam chcete jít? ");
        String volba = sc.nextLine().trim();

        Mistnost novaMistnost = sm.getMistnost(volba);
        if (novaMistnost != null && sm.sousedniMistnost(mojePozice).contains(novaMistnost)) {
            hrac.setMojePozice(novaMistnost);
            novaMistnost.vstoupit(hrac);
            return "Přesunuli jste se do: " + novaMistnost;
        }
        return "Tam nejde jít.";
    }

}
