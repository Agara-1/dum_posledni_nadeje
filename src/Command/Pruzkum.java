package Command;

import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Predmet;

import java.util.ArrayList;
import java.util.Scanner;

public class Pruzkum implements Command {


private Hrac hrac;
private Predmet predmet;

    public Pruzkum(Hrac hrac) {
        this.hrac = hrac;

    }


    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
predmet = mojePozice.getPredmetyVMistnosti();

        if(predmet == null) {
            return "v teto mistnosti nejsou zadne predmety";
        }
        return "Nasli jste: " + predmet;

    }


}
