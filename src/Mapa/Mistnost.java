package Mapa;

import Postavy.Hrac;
import Postavy.Postava;
import Postavy.Vezen;
import Veci.Akumulatory;
import Veci.Predmet;

import java.util.*;


/**
 * Třída reprezentující místnost ve hře.
 * Místnost může obsahovat postavy a předměty, a hráč může do ní vstoupit.
 */
public class Mistnost {
   private String nazev;
   private ArrayList<Postava> postavyVMistnosti;
   private Predmet predmetyVMistnosti;
   private boolean trezorodemceny = false;
   private boolean prozkoumana = false;

   public Mistnost(String nazev) {
      this.nazev = nazev;
      this.postavyVMistnosti = new ArrayList<>();

   }

   public String getNazev() {
      return nazev;
   }

   public void pridaniPostavy(Postava p) {
      postavyVMistnosti.add(p);
   }

   public ArrayList<Postava> getPostavyVMistnosti() {
      return postavyVMistnosti;
   }

   public void pridatPredmet(Predmet p) {
      this.predmetyVMistnosti = p;
   }

   public void odstranitPredmet(Predmet p) {
      this.predmetyVMistnosti = null;
   }

   public Predmet getPredmetyVMistnosti() {
      return predmetyVMistnosti;
   }

   public boolean isTrezorodemceny() {
      return trezorodemceny;
   }
   public boolean otevritTrezor(){
      return trezorodemceny = true;
   }

   public boolean isProzkoumana() {
      return prozkoumana;
   }
   public boolean prozkoumanaM(){
      return prozkoumana = true;
   }

   Postava vezen = null;

   /**
    * Metoda pro vstup hráče do místnosti.
    *    Pokud hráč vstoupí do místnosti "Obývák" nebo "Chodba" a rádio je zapnuto, hráč uvidí vězně a interakci s psychologem.
    */
     public void vstoupit(Hrac hrac) {
      Mistnost mojePozice = hrac.getMojePozice();
      if ((mojePozice.getNazev().equals("Obyvak") || mojePozice.getNazev().equals("Chodba")) && Akumulatory.radioZapnuto) {
         System.out.println("\nJakmile vstoupíš do chodby, cítíš něco divného...\n" +
                 "Na podlaze v obyvaku leží vězeň, jeho tělo nehybné, oči prázdné.\n" +
                 "Ostatní vypadají šokovaně, ale nejvíce tě znepokojuje výraz psychologa.\n" +
                 "Pomalu si přisedne vedle těla a zamyšleně řekne:\n" +
                 "\"Ne všichni si zaslouží přežít... To byla nutná oběť.\"\n");
      }
   }

   @Override
   public String toString() {
      return nazev;
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