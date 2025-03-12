package Command;
import Mapa.Mistnost;
import Postavy.*;
import Veci.Zbran;

import java.util.Scanner;

public class Utok implements Command {

    private Postava postava;
    private Hrac hrac;
    private Scanner sc;
    private Zbran zbran;



    public Utok(Hrac hrac) {
        this.hrac = hrac;
        this.sc = new Scanner(System.in);
    }

    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();

        if (!hrac.getPredmety().contains(zbran)) {
            return "nemate zbran, aby jste mohl zautocit potrebujete zbran";

        } else if (mojePozice.getPostavyVMistnosti().isEmpty()) {
            return "v mistnosti nikdo neni";
        }else{
            System.out.println(" na koho chcete zautocit" + mojePozice.getPostavyVMistnosti());
            String vyber = sc.nextLine();

            for (Postava p : mojePozice.getPostavyVMistnosti()) {
                if(postava.getJmeno().equalsIgnoreCase(vyber)){
                    mojePozice.getPostavyVMistnosti().remove(p);
                    return "zabil jsi" + vyber;
                }
            }
        }
        return "tato postava zde neni";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
