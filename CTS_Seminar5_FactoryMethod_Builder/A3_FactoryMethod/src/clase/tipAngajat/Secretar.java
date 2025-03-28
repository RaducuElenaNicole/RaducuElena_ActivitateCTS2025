package clase.tipAngajat;

import clase.Angajat;

public class Secretar extends Angajat {
    private int vechime;

    public Secretar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }
}
