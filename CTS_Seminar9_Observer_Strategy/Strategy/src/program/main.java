package program;

import clase.Calator;
import clase.CardCalatorie;
import clase.IMetodaPlata;
import clase.PlataSMS;

public class main {
    public static void main(String[] args) {
        System.out.println("\n---------------- STRATEGY ----------------\n\n");

        IMetodaPlata cardCalatorie = new CardCalatorie(2);
        IMetodaPlata plataSMS = new PlataSMS();

        Calator calator = new Calator("Maria IONITA", 10);
        calator.platesteCalatorie(3);

        System.out.println("------------------");
        calator.setMetodaPlata(cardCalatorie);
        calator.platesteCalatorie(3);
        System.out.println();
        calator.platesteCalatorie(3);
        System.out.println();
        calator.platesteCalatorie(3);

        System.out.println("------------------");
        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie(3);
    }
}
