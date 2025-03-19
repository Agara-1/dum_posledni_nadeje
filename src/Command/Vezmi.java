package Command;

import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Predmet;
import java.util.Scanner;

public class Vezmi implements Command {

private Hrac hrac;;
private Predmet predmet;

    public Vezmi(Hrac hrac) {
        this.hrac = hrac;

    }

    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
         predmet = mojePozice.getPredmetyVMistnosti();

        if (predmet == null) {
            return "V místnosti nejsou žádné předměty.";
        }

        hrac.vzitPredmet(predmet);

        mojePozice.odstranitPredmet(predmet);

        return "Vzal jsi: " + predmet.getNazev();
    }

}
