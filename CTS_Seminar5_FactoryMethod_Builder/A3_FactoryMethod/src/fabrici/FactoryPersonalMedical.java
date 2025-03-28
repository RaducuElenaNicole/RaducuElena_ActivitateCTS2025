package fabrici;

import clase.Angajat;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {

        return null;
    }
}
