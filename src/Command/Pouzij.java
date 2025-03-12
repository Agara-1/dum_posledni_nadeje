package Command;

import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Predmet;

import java.util.Scanner;

public class Pouzij implements Command {
    private Hrac hrac;
    private Mistnost mistnost;
    private Scanner sc;


    public Pouzij(Hrac hrac) {
        this.sc = new Scanner(System.in);
        this.mistnost = mistnost;
        this.hrac = hrac;
    }


    @Override
    public String execute() {
        if(hrac.getPredmety().isEmpty()){
            return "nemas nic v inventari";
        }else{
            System.out.println("Jaky z predmetu chces pouzit? " + hrac.getPredmety());
            String vyber = sc.nextLine();
            for(Predmet p : hrac.getPredmety()){
                if(p.getNazev().equalsIgnoreCase(vyber)){
                    return p.pouziti(mistnost , hrac);
                }
            }
        }
        return "tento predmet nemas v inventari";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
