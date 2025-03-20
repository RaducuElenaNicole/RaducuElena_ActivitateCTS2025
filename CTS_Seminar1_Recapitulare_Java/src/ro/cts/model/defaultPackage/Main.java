package ro.cts.model.defaultPackage;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mihai", 20, 1, 900));
        students.add(new Student("Ileana", 22, 2, 700));
        students.add(new Student("Valentina", 21, 3, 500));

        Curs curs = new Curs("CTS", 4, new Profesor("Adrian", 35, 10, 4500, 0.35f), students);

        curs.sustineExamen("05/02/2024");

        curs.getProfesor().preda();
        System.out.println("Venitul profesorului este: " + ((Persoana)curs.getProfesor()).calculareVenit());
        curs.setProfesor(new Asistent("Maria", 26, 12, 3900.0f));
        curs.sustineExamen("10/08/2025");
        Lector lect = new Lector("Ana", 40);
        lect.preda();
        curs.setProfesor(lect);
        curs.sustineExamen("12/06/2020");
    }
}