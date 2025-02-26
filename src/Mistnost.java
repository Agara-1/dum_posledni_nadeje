import java.util.Objects;

public class Mistnost {
   private String nazev;


   public Mistnost() {
   }

   public Mistnost(String nazev) {
      this.nazev = nazev;
   }

   public String getNazev() {
      return nazev;
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

