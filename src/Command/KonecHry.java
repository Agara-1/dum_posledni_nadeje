package Command;

import Source.Console;

public class KonecHry implements Command {
    private Console console;

    public KonecHry(Console console) {
        this.console = console;
    }

    @Override
    public String execute() {
        console.ukoncitHru();
        return "Hra byla ukoncena";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
