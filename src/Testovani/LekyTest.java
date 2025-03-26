package Testovani;
import Mapa.Mistnost;
import Postavy.Hrac;
import Veci.Leky;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Tento test ověřuje, že lék správně léčí hráče, a to jak v případě snížení zdraví, tak dosažení maximální hodnoty HP.
public class LekyTest {

    /* Testuje správnou funkčnost léčby hráče.
         Ověřuje, že lék správně vyléčí hráče o 20 HP a vrátí správnou zprávu,
    a že pokud má hráč plné HP, bude vrácena zpráva, že HP jsou již plné.*/
    @Test
    public void testPouziti() {
        Mistnost chodba = new Mistnost("Chodba");
        Hrac hrac = new Hrac("Test", chodba);

        hrac.vylecit(-20);
        assertEquals(60, hrac.getHp());

        Leky leky = new Leky("Leky");


        String result = leky.pouziti(chodba, hrac);
        System.out.println(result); // Для діагностики


        assertTrue(result.contains("o 20 HP více"));
        assertEquals(80, hrac.getHp());


        hrac.vylecit(50);
        result = leky.pouziti(chodba, hrac);
        assertEquals("Tvoje HP je plné.", result);
    }
}