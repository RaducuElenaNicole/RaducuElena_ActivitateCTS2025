package fabrici;

import clase.tipAngajat.PersonalSpital;
import clase.tipAngajat.Portar;
import clase.tipAngajat.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal {
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public PersonalSpital crearePersonajSpital(TipPersonalSpital tip, String nume, double salariu) {
        return switch((TipPersonalNonMedical)tip){
            case PORTAR -> new Portar(nume, salariu, vechime);
            case SECRETAR ->  new Secretar(nume, salariu, vechime);
            default -> null;
        };
    }
}
