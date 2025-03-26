package Testovani;


import Mapa.Pohyb;
import Mapa.Mistnost;
import Mapa.SvetovaMapa;
import Postavy.Hrac;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Tento test ověřuje správné přesuny hráče do sousedních místností, chování při pokusu o přesun do neplatných nebo neexistujících místností.
public class PohybTest {
    private SvetovaMapa mapa;
    private Hrac hrac;

    @BeforeEach
    void setUp() {
        mapa = new SvetovaMapa();
        hrac = new Hrac("TestHrac", mapa.getMistnost("Chodba"));
    }

    //estuje přesun hráče do sousední místnosti.
    //Ověřuje, že hráč správně přejde do sousední místnosti, pokud existuje.
    @Test
    void testPresunDoSousedniMistnosti() {
        hrac.setMojePozice(mapa.getMistnost("Chodba"));

        Mistnost cilovaMistnost = mapa.getMistnost("Sklep");
        if (mapa.sousedniMistnost(hrac.getMojePozice()).contains(cilovaMistnost)) {
            hrac.setMojePozice(cilovaMistnost);
        }

        assertEquals("Sklep", hrac.getMojePozice().getNazev(), "Hráč by měl být ve Sklepě.");
    }

    //Testuje neplatný pokus o přesun do místnosti, která není sousední.
    //Ověřuje, že pokus o přesun mezi místnostmi, které nejsou sousední, neproběhne.
    @Test
    void testNeplatnyPresun() {
        hrac.setMojePozice(mapa.getMistnost("Pokoj1"));
        Mistnost nesousedniMistnost = mapa.getMistnost("Pokoj2"); // Pokoj1 a Pokoj2 nejsou propojeny

        boolean jeSousedni = mapa.sousedniMistnost(hrac.getMojePozice()).contains(nesousedniMistnost);

        assertFalse(jeSousedni, "Pokoj1 a Pokoj2 by neměly být sousední místnosti.");
    }

//Testuje chování při pokusu o přístup k neexistující místnosti.
//Ověřuje, že pokus o získání neexistující místnosti vrátí hodnotu null.
    @Test
    void testNeexistujiciMistnost() {
        Mistnost neexistujici = mapa.getMistnost("NeznamaMistnost");
        assertNull(neexistujici, "Neznámá místnost by měla vrátit null.");
    }
}