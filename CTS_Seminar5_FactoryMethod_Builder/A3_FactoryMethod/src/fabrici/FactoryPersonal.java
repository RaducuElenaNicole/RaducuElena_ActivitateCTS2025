package fabrici;

import clase.tipAngajat.PersonalSpital;

public interface FactoryPersonal {
    PersonalSpital crearePersonajSpital(TipPersonalSpital tip, String nume, double salariu);
}
