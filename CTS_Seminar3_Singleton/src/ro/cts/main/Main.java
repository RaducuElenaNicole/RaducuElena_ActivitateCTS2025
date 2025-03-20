package ro.cts.main;

import ro.cts.autoritateMasini.clase.AutoritateReglementareMasiniEager;
import ro.cts.autoritateMasini.clase.AutoritateReglementareMasiniLazy;
// aici se initializeaza prima data instanta

public class Main {
    public static void main(String[] args) {
        AutoritateReglementareMasiniEager autoritate
                = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2
                = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebSite("www.siteNou_autoritate2.ro");
        System.out.println(autoritate2);

        System.out.println(autoritate);

        autoritate2.reglementeazaModelMasina("Dacia Logan");
        System.out.println(autoritate2);

        AutoritateReglementareMasiniLazy autoritateL
                = AutoritateReglementareMasiniLazy.getInstance("Auto_L", "www.auto_lazy.ro");

        System.out.println(autoritateL);

        AutoritateReglementareMasiniLazy autoritateL2
                = AutoritateReglementareMasiniLazy.getInstance("Auto_L_2", "www.auto_lazy_2.ro");

        System.out.println(autoritateL2);
    }
}
