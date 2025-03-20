package ro.cts.clase.readere;

import ro.cts.clase.Aplicant;
import ro.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elv = new Elev();
            super.citesteAplicant(input2, elv);

            int clasa = input2.nextInt();
            elv.setClasa(clasa);

            String tutore = input2.next();
            elv.setTutore(tutore);

            elevi.add(elv);
        }

        input2.close();
        return elevi;
    }

}
