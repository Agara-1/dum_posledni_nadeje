import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SvetovaMapa {
private HashMap<Mistnost, ArrayList<Mistnost>> svet = new HashMap<>();
private String tvojePozice;

    public SvetovaMapa() {
        nactitaniMapy();
    }

    public boolean nactitaniMapy(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("mapa.csv"));
            String line;


            while((line = br.readLine())  != null ){

                String[] rozdelene = line.split(",");
                Mistnost m = new Mistnost(rozdelene[0]);
                ArrayList<Mistnost> sousedniMistnosti = new ArrayList<>();

                for ( String nazevMistnosti: Arrays.copyOfRange(rozdelene, 1, rozdelene.length)) {
                    sousedniMistnosti.add(new Mistnost(nazevMistnosti));
                }

                svet.put(m, sousedniMistnosti);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

return true;
    }
    public ArrayList<Mistnost> sousedniMistnost(Mistnost m){
        return svet.getOrDefault(m, new ArrayList<>());
    }

    public HashMap<Mistnost, ArrayList<Mistnost>> getSvet() {
        return svet;
    }
}
