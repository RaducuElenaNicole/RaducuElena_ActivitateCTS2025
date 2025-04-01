package Program;

import clase.tipAngajat.PersonalSpital;
import fabrici.FactoryPersonalMedical;
import fabrici.FactoryPersonalNonMedical;
import fabrici.TipPersonalMedical;
import fabrici.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(10.4);
        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(15);

        PersonalSpital medic = factoryPersonalMedical.crearePersonajSpital(TipPersonalMedical.MEDIC, "Marcel", 10000);
        factoryPersonalMedical.setSpor(100);
        System.out.println(medic.toString());

        PersonalSpital portar = factoryPersonalNonMedical.crearePersonajSpital(TipPersonalNonMedical.PORTAR, "Costel", 4000);
        factoryPersonalNonMedical.setVechime(34);
        System.out.println(portar.toString());
    }
}
