import Source.Console;

import java.io.IOException;

/**
 * Hlavní třída spouštějící hru.
 */
public class Main {
    public static void main(String[] args) {
Console c = new Console();

        try {
            c.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
