package Mapa;

import Postavy.Postava;
import Veci.Predmet;

import java.util.ArrayList;
import java.util.Objects;

public class Mistnost {
   private String nazev;

private ArrayList<Predmet> predmetyVMistnosti;
private ArrayList<Postava> postavyVMistnosti;

   public Mistnost() {
   }

   public Mistnost(String nazev) {
      this.nazev = nazev;
      this.postavyVMistnosti = new ArrayList<>();
      this.predmetyVMistnosti = new ArrayList<>();
   }

   
   public String getNazev() {
      return nazev;
   }
   public void pridaniPostavy(Postava po) {
      postavyVMistnosti.add(po);

   }
public void pridatPredmet(Predmet p){
      predmetyVMistnosti.add(p);
   }
public void odstranitPredmetZMistnosti(Predmet p){
      predmetyVMistnosti.remove(p);
}

   public ArrayList<Predmet> getPredmetyVMistnosti() {
      return predmetyVMistnosti;
   }

   public ArrayList<Postava> getPostavyVMistnosti() {
      return postavyVMistnosti;
   }

   @Override
   public String toString() {
      return
                nazev + '\''
              ;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Mistnost mistnost = (Mistnost) o;
      return Objects.equals(nazev, mistnost.nazev);
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(nazev);
   }
}

