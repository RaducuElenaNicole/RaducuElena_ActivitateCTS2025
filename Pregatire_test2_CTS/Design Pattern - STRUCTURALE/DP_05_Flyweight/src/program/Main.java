package program;

import clase.Flyweight.Receptie;
import clase.partea_comuna.Spitalizare;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------------------- Flyweight -----------------------\n");

        Receptie receptie = new Receptie();

        receptie.getPacient("1234", "Aurel POPESCU", 35);
        receptie.getPacient("4567", "Maria POPESCU", 85);
        receptie.getPacient("7890", "Ion POPESCU", 25);

        Spitalizare s1 = new Spitalizare(1, 2, 14);
        Spitalizare s2 = new Spitalizare(2, 9, 3);
        Spitalizare s3 = new Spitalizare(3, 5, 4);
        Spitalizare s4 = new Spitalizare(4, 6, 21);

        System.out.println("\n-----");
        receptie.getPacient("1234", "Aurel POPESCU", 35)
                .afisareDetaliiSpitalizare(s1);

        System.out.println("\n-----");
        receptie.getPacient("1004", "Aurel POPESCU", 35)
                .afisareDetaliiSpitalizare(s1);

        System.out.println("\n-----");
        System.out.println(receptie.getPacient("2900"));

        System.out.println("\n-----");
        receptie.getPacient("4567", "Maria POPESCU", 85)
                .afisareDetaliiSpitalizare(s2);

        System.out.println("\n-----");
        receptie.getPacient("7890", "Ion POPESCU", 25)
                .afisareDetaliiSpitalizare(s3);

        System.out.println("\n-----");
        receptie.getPacient("1200", "Ana AVRAM", 28)
                .afisareDetaliiSpitalizare(s3);

        System.out.println("\n-----");
        receptie.getPacient("1200", "Ana AVRAM", 28)
                .afisareDetaliiSpitalizare(s4);
    }
}
