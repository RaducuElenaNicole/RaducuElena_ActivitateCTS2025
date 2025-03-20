package ro.cts.clase.readere;

import ro.cts.clase.Angajat;
import ro.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat ang = new Angajat();
            super.citesteAplicant(input2, ang);

            int salariu = input2.nextInt();
            ang.setSalariu(salariu);

            String ocupatie = input2.next();
            ang.setOcupatie(ocupatie);

            angajati.add(ang);
        }

        input2.close();
        return angajati;
    }

}
