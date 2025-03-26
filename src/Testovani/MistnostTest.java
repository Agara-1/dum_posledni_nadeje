package Testovani;

import Mapa.Mistnost;
import Veci.Predmet;
import Veci.Leky;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Tento test ověřuje správnou funkčnost přidávání a odstraňování předmětů z místnosti.
public class MistnostTest {
    private Mistnost mistnost;
    private Predmet leky;

    @BeforeEach
    void setUp() {
        mistnost = new Mistnost("Koupelna");
        leky = new Leky("Leky");
    }

//Testuje přidávání předmětů do místnosti.
// Ověřuje, že po přidání předmětu do místnosti je tento předmět skutečně v místnosti a že jeho název je správný.
    @Test
    void testNastaveniPredmetu() {
        mistnost.pridatPredmet(leky);


        assertNotNull(mistnost.getPredmetyVMistnosti(), "Místnost by měla obsahovat předmět.");
        assertEquals("Leky", mistnost.getPredmetyVMistnosti().getNazev(), "Předmět v místnosti by měl být 'Leky'.");
    }

    //Testuje odstraňování předmětů z místnosti.
    //Ověřuje, že po odstranění předmětu je místnost prázdná.
    @Test
    void testOdebraniPredmetu() {
        mistnost.pridatPredmet(leky);
        mistnost.odstranitPredmet(leky);


        assertNull(mistnost.getPredmetyVMistnosti(), "V místnosti by neměl být žádný předmět.");
    }
}