package Mapa;

import Command.Command;
import Postavy.Hrac;

import java.util.Scanner;


/**
 * Třída pro realizaci pohybu hráče mezi místnostmi v rámci světové mapy.
 * Umožňuje hráči vybrat si směr, do kterého se chce přesunout, a provádí přesun, pokud je to možné.
 */
public class Pohyb implements Command {
    private Scanner sc = new Scanner(System.in);
    private SvetovaMapa sm;
    private Hrac hrac;

    public Pohyb(SvetovaMapa sm, Hrac hrac) {
        this.sm = sm;
        this.hrac = hrac;
    }

    /**
     *  Metoda pro vykonání příkazu pohybu.
     *  Vyzve hráče, aby zadal směr (název místnosti), do které chce přejít.
     *  Pokud je směr platný a sousedí s aktuální místností, hráč se přesune do nové místnosti.
     *  Pokud směr není platný, zobrazí se chybová zpráva.
     */


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
