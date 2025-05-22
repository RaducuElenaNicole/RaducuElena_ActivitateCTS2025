package A6.program;

import A6.ModulFacade;
import A6.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- FACADE ----------\n");

        Pacient pacient1 = new Pacient("Alexandru Matei", 1);
        System.out.println(pacient1.toString());
        ModulFacade internarePacient1 = new ModulFacade();
        System.out.println(internarePacient1.verificareInternarePacient(pacient1));

        System.out.println("\n-----------------");
        Pacient pacient2 = new Pacient("Andreea Marin", 10);
        System.out.println(pacient2.toString());
        ModulFacade internarePacient2 = new ModulFacade();
        System.out.println(internarePacient2.verificareInternarePacient(pacient2));
    }
}
