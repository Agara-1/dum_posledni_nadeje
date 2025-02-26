import java.util.ArrayList;
import java.util.Scanner;

public class Pohyb implements Command {
private Mistnost mojePozice;
private Scanner sc = new Scanner(System.in);
SvetovaMapa sm = new SvetovaMapa();
public Pohyb() {}

public Pohyb(Mistnost start) {
    this.mojePozice = start;
}


@Override
public String execute(){
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
