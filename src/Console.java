import Command.Command;
import Mapa.Mistnost;
import Mapa.Pohyb;
import Mapa.SvetovaMapa;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private boolean exit = false;
    private HashMap<String, Command> prikazy = new HashMap<>();
    private SvetovaMapa sm = new SvetovaMapa();

public void inicializace(){
    prikazy.put("jdi", new Pohyb(new Mistnost("Chodba")));

}
private Scanner sc = new Scanner(System.in);

public void delejPrikaz() throws IOException {
    System.out.println(sm.getSvet());
    System.out.println(">>");
    String command = sc.nextLine();
    command = command.toLowerCase();
    command = command.trim();
    if(prikazy.containsKey(command)){
        System.out.println( prikazy.get(command).execute());

    }else {
        System.out.println("Neznamy prikaz");
    }
}

public void start() throws IOException {
    inicializace();
    do{
        delejPrikaz();
    }while(!exit);

}

}
