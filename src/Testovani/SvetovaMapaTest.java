package Testovani;
import Mapa.SvetovaMapa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//Tento test ověřuje, že místnost je správně načtena na základě jejího názvu.
public class SvetovaMapaTest {

    //instanci místnosti na základě názvu.
    //Ověřuje, že načtení místnosti "Chodba" nebude vracet null.
    @Test
    void testNacteniMistnosti() {
        SvetovaMapa mapa = new SvetovaMapa();
        assertNotNull(mapa.getMistnost("Chodba"));
    }
}