package program;

import clase.Pacient;
import clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();

        pacientBuilder.setAreHalat(true).setArePatRabatabil(true).setNumePacient("Moris");

        Pacient pacient1 = pacientBuilder.build("Costel");
        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Ioana").build("Marian");
        System.out.println(pacient2.toString());

        Pacient pacient3 = pacientBuilder.setNumeInsotitor("Andrei").build("Costel");
        System.out.println(pacient3.toString());

    }
}
