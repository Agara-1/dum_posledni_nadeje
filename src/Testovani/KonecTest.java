package Testovani;
import Command.KonecHry;
import Source.Console;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Tento test se zaměřuje na ukončení hry.
public class KonecTest {
    private Console console;
    private KonecHry konecHry;

    @BeforeEach
    void setUp() {
        console = new Console();
        konecHry = new KonecHry(console);
    }

    //Testuje metodu.
    // Tento test ověřuje, že metoda správně vrací
    // zprávu "Hra byla ukoncena" při ukončení hry.
    @Test
    void testVraciSpravnouZpravu() {
        String vysledek = konecHry.execute();
        assertEquals("Hra byla ukoncena", vysledek, "Výstup by měl být 'Hra byla ukoncena'.");
    }
}