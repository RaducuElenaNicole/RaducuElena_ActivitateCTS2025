package ro.cts.clase.readere;

import ro.cts.clase.Aplicant;
import ro.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student stud =  new Student();
            // apelare metoda din parinte
            super.citesteAplicant(input, stud);

            int an_studii = input.nextInt();
            stud.setAn_studii(an_studii);

            String facultate = (input.next()).toString();
            stud.setFacultate(facultate);

            studenti.add(stud);
        }
        input.close();
        return studenti;
    }
}
