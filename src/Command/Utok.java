package Command;
import Mapa.Mistnost;
import Postavy.*;
import Veci.Predmet;
import Veci.Zbran;

import java.util.ArrayList;

import java.util.Scanner;

public class Utok implements Command {

    private Hrac hrac;
    private Scanner sc;




    public Utok(Hrac hrac) {
        this.hrac = hrac;
        this.sc = new Scanner(System.in);
    }

    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
        ArrayList<Postava> postavyVMistnosti = mojePozice.getPostavyVMistnosti();
        Postava cil = null;


        boolean maZbran = false;
        for (Predmet p : hrac.getInventar()) {
            if (p instanceof Zbran) {
                maZbran = true;
                break;
            }
        }

        if (maZbran && !postavyVMistnosti.isEmpty()) {
            System.out.println("Na koho chcete zaútočit? Dostupné postavy:");
            for (Postava p : postavyVMistnosti) {
                System.out.println("- " + p.getJmeno());
            }

            String vyber = sc.nextLine().trim();
            for (Postava p : postavyVMistnosti) {
                if (p.getJmeno().equalsIgnoreCase(vyber)) {
                    cil = p;
                    break;
                }
            }
        }else if(!maZbran){
            return "Nemáte zbraň, abyste mohl zaútočit. Potřebujete zbraň.";
        }else if (postavyVMistnosti.isEmpty()) {
            return "V místnosti nikdo není.";
        }else if (cil == null) {
            return "Tato postava zde není.";
        }

        postavyVMistnosti.remove(cil);

        if (cil instanceof Psycholog) {
            return """
                Psycholog se zhroutil na zem, jeho šílený pohled konečně vyhasl.
                U jeho těla nacházíte deník plný podivných zápisů – byl to on!
                On byl vrah, který tahal za nitky celou dobu.
                
                Dokázal jsi to! Zlo bylo poraženo, ale za jakou cenu?
                
                 GRATULUJEME! Úspěšně jsi dokončil hru. 
            """;
        } else if (!(cil instanceof Psycholog)) {
            return "Zabil jsi " + cil.getJmeno() + """
                     Zabil jsi nevinného člověka... 
                    Ostatní přeživší na tebe hledí s šokem a hněvem.
                    Než si stačíš cokoli vysvětlit, rozhodnou se tě zabit.
                    Tvůj osud je zpečetěn. Hra je ukončena – PROHRÁL JSI.""";
        }

        return "Zabil jsi " + cil.getJmeno() + "!";
    }


}
