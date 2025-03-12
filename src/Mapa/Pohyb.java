package Mapa;

import Command.Command;
import Postavy.Hrac;

import java.util.Scanner;

public class Pohyb implements Command {

private Scanner sc = new Scanner(System.in);
SvetovaMapa sm = new SvetovaMapa();
private Hrac hrac;
public Pohyb(SvetovaMapa sm, Hrac hrac) {
    this.hrac = hrac;
}




@Override
public String execute(){
    Mistnost mojePozice = hrac.getMojePozice();
    System.out.println("Teď jsi v: " + mojePozice);
    System.out.println( sm.sousedniMistnost(mojePozice));
    System.out.println("Kam chcete jit");
    String volba = sc.nextLine();

    for (Mistnost m : sm.sousedniMistnost(mojePozice)) {
        if(m.getNazev().equalsIgnoreCase(volba)){
            mojePozice = m;
            return "presunuli jste se do: " + mojePozice;
        }


    }
    return "nejde tam jit";
}

    @Override
    public boolean exit() {
        return false;
    }
}
