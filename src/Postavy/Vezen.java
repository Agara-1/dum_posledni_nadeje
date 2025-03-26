package Postavy;

import Mapa.Mistnost;

//reprezentuje postavu vězně jménem Jack ve hře.
public class Vezen extends Postava {
    public Vezen(String jmeno, String povolani, String text, Mistnost mistnost) {
        super("Jack", text, mistnost);
    }

    @Override
    public String toString() {
        return "Vezen";
    }

    //Vrací pole hlášek, které vězeň říká hráči během konverzace.
    @Override
    protected String[] getHlasky() {
        return new String[]{
                "Nebudu lhát, tady to není o moc horší než vězení.",
                "Viděl jsem dost násilí na власні oči. Nechci to zažít znovu.",
                "Lidi soudí podle minulosti, ale já se změnil… nebo ne?",
                "Jestli někomu nebudeš věřit, poslouchej svůj instinkt. Často má pravdu.",
                "Petr se mě ptal na věci, které nesouvisí s psychologií… možná ho zajímá něco jiného než naše duševní zdraví." +
        "Před pár dny jsem ho viděl v noci u dveří… jen tam stál a poslouchal. Myslíš, že se jen tak procházel?"
        };
    }
}
