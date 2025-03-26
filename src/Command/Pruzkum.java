package Command;

import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Predmet;

import java.util.ArrayList;
import java.util.Scanner;

// Třída implementující příkaz pro prozkoumání místnosti.
//Tato třída umožňuje hráči prozkoumat místnost a zjistit, zda se v ní nacházejí předměty.
public class Pruzkum implements Command {


    private Hrac hrac;
    private Predmet predmet;

    public Pruzkum(Hrac hrac) {
        this.hrac = hrac;

    }

/* Metoda pro vykonání příkazu prozkoumání místnosti.
  Hráč může prozkoumat místnost a zjistit, zda se v ní nachází nějaké předměty.
  Pokud se v místnosti nachází určité předměty nebo je splněna podmínka pro trezor, vrátí odpovídající zprávu.*/
    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
        predmet = mojePozice.getPredmetyVMistnosti();
        mojePozice.prozkoumanaM();
        if(predmet == null) {
            return "v teto mistnosti nejsou zadne predmety";
        }else if (predmet.getNazev().equals("Macete") && !mojePozice.isTrezorodemceny() ){
            return "Nasli jste trezor";
        }
        return "Nasli jste: " + predmet;

    }


}
