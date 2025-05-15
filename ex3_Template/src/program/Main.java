package program;

import clase.EvenimentPrivat;
import clase.Invitat;
import clase.Restaurant;
import clase.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------- TEMPLATE METHOD ---------------\n");

        Invitat invitat1 = new Invitat("Alina MATEI", 3);
        Invitat invitat2 = new Invitat("Ioan TUDOSE", 6);

        TemplateOcupareMasa masa1 = new EvenimentPrivat("botez", 130);
        masa1.ocupareMasa(invitat1);
        System.out.println("\n-----------------------\n");
        masa1.ocupareMasa(invitat2);

        System.out.println("\n-----------------------\n");
        TemplateOcupareMasa masa2 = new Restaurant();
        masa2.ocupareMasa(invitat2);


    }
}
