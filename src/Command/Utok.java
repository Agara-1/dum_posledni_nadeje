package Command;

import Postavy.Postava;

public class Utok implements Command {

    private Postava postava;
    @Override
    public String execute() {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
