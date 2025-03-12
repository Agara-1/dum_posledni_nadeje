package Command;

import Mapa.Mistnost;
import Postavy.Hrac;

public class Pruzkum implements Command {
private Hrac hrac;


    public Pruzkum(Hrac hrac) {
        this.hrac = hrac;
    }




    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();

        if(mojePozice.getPredmetyVMistnosti().isEmpty()){
            return "v teto mistnosti nejsou zadne predmety";
        }
        return "Nasli jste: " + mojePozice.getPredmetyVMistnosti();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
