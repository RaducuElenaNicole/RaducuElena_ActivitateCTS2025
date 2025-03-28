package clase.tipAngajat;

import clase.Angajat;

public class Medic extends Angajat {
    private double vechime;

    public Medic(String nume, double salariu, double vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }
}
