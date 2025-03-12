package Command;

import Mapa.Mistnost;
import Postavy.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Mluv implements Command {
    private Scanner sc;
    private Hrac hrac;


    public Mluv(Hrac hrac) {
        this.hrac = hrac;
        this.sc = new Scanner(System.in);
    }

    @Override
    public String execute() {
        Mistnost mojePozice = hrac.getMojePozice();
        ArrayList<Postava> postavy = mojePozice.getPostavyVMistnosti();

        if(mojePozice.getPostavyVMistnosti().isEmpty()){
            return "v teto mistnosti nikdo neni";

        }

        System.out.println("vyberte postavu s kterou chcete mluvit" + mojePozice.getPostavyVMistnosti());
        String jmenoPostavy = sc.nextLine().trim();

        for (Postava p : mojePozice.getPostavyVMistnosti()) {
            if(p.getJmeno().trim().equals(jmenoPostavy.trim())){
                return p.getJmeno() + " : " + p.getText();
            }
        }

        return "tato postava zde neni";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
