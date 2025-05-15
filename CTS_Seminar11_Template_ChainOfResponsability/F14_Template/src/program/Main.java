package program;

import clase.MetrouDreapta;
import clase.MetrouSpecial;
import clase.MetrouStanga;
import clase.MetrouTemplate;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------- TEMPLATE ---------------\n");

        MetrouTemplate metrouDr = new MetrouDreapta(6);
        MetrouTemplate metrouStg = new MetrouStanga(2);
        MetrouTemplate metrouSpecial = new MetrouSpecial();

        System.out.println("\n--------------------");
        metrouStg.circula();
        metrouStg.circulaRetur();

        System.out.println("\n--------------------");
        metrouDr.circula();
        metrouDr.circulaRetur();

        System.out.println("\n--------------------");
        metrouSpecial.circula();
        metrouSpecial.circulaRetur();
    }
}
