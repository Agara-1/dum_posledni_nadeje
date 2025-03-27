package Command;

import Mapa.Mistnost;
import Postavy.*;
import java.util.Scanner;

/**
 * Třída implementující příkaz pro mluvení s postavami v místnosti.
 * Umožňuje hráči vybrat postavu v místnosti a zahájit konverzaci.
 */

public class Mluv implements Command {

    private Scanner sc;
    private Hrac hrac;


    public Mluv(Hrac hrac) {
        this.hrac = hrac;
        this.sc = new Scanner(System.in);
    }

    /**
     *  Metoda pro vykonání příkazu mluvení s postavou v aktuální místnosti.
     *  Hráč si může vybrat postavu, se kterou chce komunikovat.
     *  Pokud v místnosti není žádná postava nebo vybere neexistující postavu, vrátí odpovídající zprávu.
     */

    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();

        if (!mojePozice.getPostavyVMistnosti().isEmpty()) {
            System.out.println("Vyberte postavu, se kterou chcete mluvit: ");
            for (Postava p : mojePozice.getPostavyVMistnosti()) {
                System.out.println("- " + p.getJmeno());
            }

            String jmenoPostavy = sc.nextLine().trim();

            for (Postava p : mojePozice.getPostavyVMistnosti()) {
                if (p.getJmeno().equalsIgnoreCase(jmenoPostavy)) {
                    return p.getJmeno() + ": " + p.mluv();
                }
            }
        } else if (mojePozice.getPostavyVMistnosti().isEmpty()) {
            return "V této místnosti nikdo není.";
        }

        return "Tato postava zde není.";
    }


}
