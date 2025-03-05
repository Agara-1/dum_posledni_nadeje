package Command;

import Veci.Predmet;

public class Pouzij implements Command {

    private Predmet predmet;


    @Override
    public String execute() {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
