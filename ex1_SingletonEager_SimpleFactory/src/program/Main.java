package program;

import SimpleFactory.MasinaFactory;
import SimpleFactory.TipMasina;
import clase.AMasina;
import clase.Masina;
import SingletonEager.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSingleton\n");
        Service service1 = Service.getInstance();

        Masina masina1 = new Masina("AG65ABR", 2008, "Kia");
        service1.acceptaMasina(masina1);

        Masina masina2 = new Masina("B123CVB", 2018, "Dacia");
        service1.acceptaMasina(masina2);
        service1.eliberareService();
        service1.acceptaMasina(masina2);

        Masina masina3 = new Masina("CJ56IOP", 2022, "Mercedes");
        Masina masina4 = new Masina("TL89WQE", 2020, "BMV");

        service1.acceptaMasina(masina3);
        service1.acceptaMasina(masina4);
        service1.eliberareService();
        service1.acceptaMasina(masina3);
        service1.eliberareService();
        service1.acceptaMasina(masina4);

        System.out.println("\n\n\nSimpleFactory\n");

        MasinaFactory fabricaMasini = new MasinaFactory("AG18HJK", 2006, "BMW");
        AMasina masinaF1 = fabricaMasini.getMasina(TipMasina.SEDAN, "Rosu");
        masinaF1.descriere();

        AMasina masinaF2 = fabricaMasini.getMasina(TipMasina.SUV, "6");
        masinaF2.descriere();

        AMasina masinaF3 = fabricaMasini.getMasina(TipMasina.VAN, "Paris");
        masinaF3.descriere();
    }
}
