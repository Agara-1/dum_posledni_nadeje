package Command;

import Mapa.Mistnost;

public class Pruzkum implements Command {

    private Mistnost mistnost;

    @Override
    public String execute() {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
