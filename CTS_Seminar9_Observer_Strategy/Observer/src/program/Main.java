package program;

import clase.Calator;
import clase.Metrou;
import clase.MijlocTransport;
import clase.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------------- OBSERVER ----------------\n\n");

        Observer calator1 = new Calator("Andrei POPESCU");
        Observer calator2 = new Calator("Maria IONESCU");
        Observer calator3 = new Calator("Mihai TOMA");
        Observer calator4 = new Calator("Gabriel OPREA");
        Observer calator5 = new Calator("Ana-Maria FLOREA");

        MijlocTransport metrou1 = new Metrou(3, "Preciziei",
                "Anghel Saligny");
        MijlocTransport metrou2 = new Metrou(2, "Pipera",
                "Tudor Arghezi");

        metrou1.adaugaObserver(calator1);
        metrou1.adaugaObserver(calator2);
        metrou1.adaugaObserver(calator3);
        metrou1.pleacaDeLaCapat();

        System.out.println("\n---------------------------------\n");
        metrou1.stergeObserver(calator1);
        metrou1.pleacaDeLaCapat();

        System.out.println("\n---------------------------------\n");
        metrou2.adaugaObserver(calator4);
        metrou2.adaugaObserver(calator5);
        metrou2.adaugaObserver(calator3);
        metrou2.pleacaDeLaCapat();

        System.out.println("\n---------------------------------\n");
        ((Metrou) metrou1).schimbareTraseu();
    }
}
