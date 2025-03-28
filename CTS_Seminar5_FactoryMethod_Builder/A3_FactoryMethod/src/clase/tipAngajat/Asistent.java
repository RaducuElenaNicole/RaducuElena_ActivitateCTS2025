package clase.tipAngajat;

import clase.Angajat;

public class Asistent extends Angajat {
    private double spor;

    public Asistent(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
