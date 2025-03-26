package Testovani;

import Postavy.Hrac;
import Mapa.Mistnost;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//Testují se zde základní funkce hráče jako nastavení počáteční místnosti a léčení.
    public class HracTest {

        //Testuje, zda hráč při vytvoření správně začíná ve zvolené místnosti.
        //V tomto testu se ověřuje, že hráč je na začátku v místnosti "Chodba".
        @Test
        void testZacatecniMistnost() {
            Hrac hrac = new Hrac("TestHrac", new Mistnost("Chodba"));
            assertEquals("Chodba", hrac.getMojePozice().getNazev(), "Hráč by měl začínat v Chodbě.");
        }


//Ověřuje, že životy hráče nepřesáhnou maximální hodnotu 100.
        @Test
        void testLeceni() {
            Hrac hrac = new Hrac("TestHrac", new Mistnost("Chodba"));
            hrac.vylecit(20);
            assertEquals(100, hrac.getHp(), "Hráč by neměl mít více než 100 HP.");
        }
}
