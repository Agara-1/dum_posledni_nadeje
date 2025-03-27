package Command;

import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Predmet;
import java.util.Scanner;

/**
 * Třída implementující příkaz pro sebrání předmětu v místnosti.
 * Tato třída umožňuje hráči vzít předmět, který se nachází v místnosti, pokud byla místnost prozkoumána.
 */
public class Vezmi implements Command {

    private Hrac hrac;;
    private Predmet predmet;

    public Vezmi(Hrac hrac) {
        this.hrac = hrac;

    }


    /**
     * Metoda pro vykonání příkazu vzít předmět.
     * Pokud místnost obsahuje předmět, který lze vzít, a byla prozkoumána,
     * hráč tento předmět vezme, jinak se zobrazí odpovídající zpráva.
     *
     */
    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
        predmet = mojePozice.getPredmetyVMistnosti();

        if (predmet == null) {
            return "V místnosti nejsou žádné předměty.";
        }else if (predmet.getNazev().equals("Macete") && !mojePozice.isTrezorodemceny() ){
            return " odmeknete trezor zamceny";
        } else if(mojePozice.isProzkoumana()){

            hrac.vzitPredmet(predmet);

            mojePozice.odstranitPredmet(predmet);
            return "Vzal jsi: " + predmet.getNazev();
        }
        return "nemate prozkoumanou mistnost";
    }

}
