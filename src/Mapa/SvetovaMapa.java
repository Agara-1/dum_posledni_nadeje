package Mapa;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SvetovaMapa {
    private HashMap<String, Mistnost> mistnosti = new HashMap<>();
    private HashMap<Mistnost, ArrayList<Mistnost>> svet = new HashMap<>();

    public SvetovaMapa() {
        nactiMapu();
    }

    private void nactiMapu() {
        try (BufferedReader br = new BufferedReader(new FileReader("mapa.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] casti = line.split(",");
                Mistnost mistnost = mistnosti.computeIfAbsent(casti[0].trim(), Mistnost::new);
                ArrayList<Mistnost> sousedi = svet.computeIfAbsent(mistnost, k -> new ArrayList<>());
                for (int i = 1; i < casti.length; i++) {
                    sousedi.add(mistnosti.computeIfAbsent(casti[i].trim(), Mistnost::new));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Mistnost getMistnost(String nazev) {
        return mistnosti.get(nazev);
    }

    public ArrayList<Mistnost> sousedniMistnost(Mistnost m) {
        return svet.getOrDefault(m, new ArrayList<>());
    }

    public HashMap<Mistnost, ArrayList<Mistnost>> getSvet() {
        return svet;
    }
}


