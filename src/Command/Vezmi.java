package Command;

import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Predmet;

import java.util.Scanner;

public class Vezmi implements Command {
private Hrac hrac;
 ;
private Scanner sc;


    public Vezmi(Hrac hrac) {
        this.sc = new Scanner(System.in);

        this.hrac = hrac;
    }

    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();

        if(mojePozice.getPredmetyVMistnosti().isEmpty()){
            return "V mistnosti nejsou zadne predmety";
        }else{
            System.out.println(" jaky predmet chces vzit?" + mojePozice.getPredmetyVMistnosti());
            String vyber = sc.nextLine();
            for(Predmet p : mojePozice.getPredmetyVMistnosti()){
                if(p.getNazev().equalsIgnoreCase(vyber)){
                    hrac.getPredmety().add(p);
                    mojePozice.getPredmetyVMistnosti().add(p);
                    return "vzal jsi:" + vyber;

                }
            }
        }
        return "tenhle predmet zde neni";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
