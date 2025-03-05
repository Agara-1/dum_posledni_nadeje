package Command;

import Postavy.Postava;
import Veci.Predmet;

public class Mluv implements Command {

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
