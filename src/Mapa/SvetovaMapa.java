package Mapa;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Třída reprezentující světovou mapu, která obsahuje místnosti a jejich vzájemné propojení.
//Mapa je načítána z CSV souboru, kde každý řádek obsahuje název místnosti a seznam sousedních místností.
public class SvetovaMapa {
    private HashMap<String, Mistnost> mistnosti = new HashMap<>();
    private HashMap<Mistnost, ArrayList<Mistnost>> svet = new HashMap<>();

    public SvetovaMapa() {
        nactiMapu();
    }

    //Metoda pro načtení mapy z CSV souboru.
    //Každý řádek v souboru obsahuje název místnosti a seznam sousedních místností oddělených čárkami.
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

// Metoda pro získání místnosti podle názvu.
    public Mistnost getMistnost(String nazev) {
        return mistnosti.get(nazev);
    }

//Metoda pro získání seznamu sousedních místností pro danou místnost.
    public ArrayList<Mistnost> sousedniMistnost(Mistnost m) {
        return svet.getOrDefault(m, new ArrayList<>());
    }

//Metoda pro získání celé mapy světa.
    public HashMap<Mistnost, ArrayList<Mistnost>> getSvet() {
        return svet;
    }
}


