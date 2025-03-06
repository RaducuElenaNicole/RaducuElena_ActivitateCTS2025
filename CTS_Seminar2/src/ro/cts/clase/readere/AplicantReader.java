package ro.cts.clase.readere;

import ro.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

// clasa abstracta
public abstract class AplicantReader {

    public abstract List<Aplicant> readAplicant(String file) throws FileNotFoundException;

    public void citesteAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        aplicant.setNume(nume);

        String prenume = (input.next()).toString();
        aplicant.setPrenume(prenume);

        int varsta = Integer.valueOf(input.nextInt());
        aplicant.setVarsta(varsta);

        int punctaj = Integer.valueOf(input.nextInt());
        aplicant.setPunctaj(punctaj);

        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        aplicant.setNr_proiecte(nr, vect);

    }
}
