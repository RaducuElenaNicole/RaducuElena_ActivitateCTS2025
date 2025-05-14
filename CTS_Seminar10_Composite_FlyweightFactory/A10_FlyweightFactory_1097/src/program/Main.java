package program;

import clase.Pacient;
import clase.Receptie;
import clase.Spitalizare;

public class Main {
    public static void main(String[] args){
        System.out.println("Flyweight!");

        Receptie receptie = new Receptie();

        receptie.getPacient("Ana Avram", "08975123456", "Bucuresti, Sector 6");
        receptie.getPacient("Ioana Avram", "08975123456", "Bucuresti, Sector 5");
        receptie.getPacient("Ioan", "08975123456", "Arges, Pitesti");

        Spitalizare s1 = new Spitalizare(1, 12, 5);
        Spitalizare s2 = new Spitalizare(2, 8, 17);
        Spitalizare s3 = new Spitalizare(3, 10, 21);
        Spitalizare s4 = new Spitalizare(4, 2, 2);

        try{
            receptie.getPacient("Ioan").afisareInformatii(s1);
            receptie.getPacient("Ana Avram").afisareInformatii(s2);
            receptie.getPacient("Ioana Avram").afisareInformatii(s3);
            receptie.getPacient("Andreea").afisareInformatii(s3);
        } catch (Exception e) {
            System.out.println("Nu exista persoana!");
        }
    }

}
