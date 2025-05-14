package program;

import clase.Pacient;
import clase.SpitalPrivat;
import clase.SpitalPublic;
import clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------------- TEMPLATE METHOD ---------------\n");

        Pacient pacient1 = new Pacient("Andrei POPESCU", 5);
        TemplateInternare spital101 = new SpitalPrivat();
        spital101.internare(pacient1);
        TemplateInternare spital201 = new SpitalPublic("Spitalul Universitar din Bucuresti");
        spital201.internare(pacient1);

        System.out.println("\n-----------------------\n");

        Pacient pacient2 = new Pacient("Raluca IORDACHE", 1);
        TemplateInternare spital102 = new SpitalPrivat();
        spital102.internare(pacient2);
        TemplateInternare spital202 = new SpitalPublic("Spitalul Militar din Arges, Pitesti");
        spital202.internare(pacient2);
    }
}
