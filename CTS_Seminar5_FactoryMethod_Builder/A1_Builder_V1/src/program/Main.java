package program;

import clase.AbstractBuilder;
import clase.Pacient;
import clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Ana Popescu");
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("George Marinescu").setAreHalat(true).getPacient();
        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Maria Toma").getPacient();
        System.out.println(pacient2.toString());

    }
}
