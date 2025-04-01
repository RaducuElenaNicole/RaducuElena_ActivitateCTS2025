package fabrici;

import clase.tipAngajat.Asistent;
import clase.tipAngajat.Medic;
import clase.tipAngajat.PersonalSpital;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }


    @Override
    public PersonalSpital crearePersonajSpital(TipPersonalSpital tip, String nume, double salariu) {
        return switch ((TipPersonalMedical)tip){
            case MEDIC -> new Medic(nume, salariu, spor);
            case ASISTENT -> new Asistent(nume, salariu, spor);
            default -> null;
        };
    }
}
