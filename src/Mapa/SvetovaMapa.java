package Mapa;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SvetovaMapa {
private HashMap<Mistnost, ArrayList<Mistnost>> svet = new HashMap<>();
private String tvojePozice;

    public boolean nactitaniMapy(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("mapa.csv"));
            String line = br.readLine();

            Mistnost mistnost = new Mistnost();
            while(line != null ){

                String[] rozdelene = line.split(",");
                Mistnost m = new Mistnost(rozdelene[0]);
                ArrayList<Mistnost> sousedniMistnosti = new ArrayList<>();

                for (int i = 0; i < rozdelene.length; i++) {
                    sousedniMistnosti.add(new Mistnost(rozdelene[i]));
                }

                svet.put(mistnost, sousedniMistnosti);
            }
            br.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }


    }


}
