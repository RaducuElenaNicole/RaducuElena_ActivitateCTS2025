package fabrici;

import clase.Angajat;

public interface FactoryPersonal {
    Angajat creareAngajat(TipPersonal tipPersonal);
}
