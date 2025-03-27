package Command;

import Source.Console;

/**
 * Třída implementující příkaz pro ukončení hry.
  */

public class KonecHry implements Command {
    private Console console;

    public KonecHry(Console console) {
        this.console = console;
    }

    /**
     *   Metoda pro vykonání příkazu ukončení hry.
     *     Zavolá metodu pro ukončení hry a vrátí zprávu o ukončení hry.
      */

    @Override
    public String execute() {
        console.ukoncitHru();
        return "Hra byla ukoncena";
    }


}
