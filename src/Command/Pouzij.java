package Command;

import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Predmet;


import java.util.Scanner;

public class Pouzij implements Command {


    private Hrac hrac;
    private Mistnost mistnost;
    private Scanner sc;
    private Predmet predmet;

    public Pouzij(Hrac hrac) {
        this.sc = new Scanner(System.in);
        this.mistnost = mistnost;
        this.hrac = hrac;
    }


    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
        if(hrac.getInventar().isEmpty()){
            return "nemas nic v inventari";
        }else{
            System.out.println("Jaky z predmetu chces pouzit? " + hrac.getInventar());
            String vyber = sc.nextLine();
            for(Predmet p : hrac.getInventar()){
                if(p.getNazev().equalsIgnoreCase(vyber)){
                    return p.pouziti(mistnost , hrac);
                }
            }
        }
        return "tento predmet nemas v inventari";
    }


}
