package program;

import clase.IRezervare;
import clase.Rezervare;
import clase.proxy.NumarPersoaneProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare rezervareNrPersoane = new NumarPersoaneProxy(rezervare);

        rezervareNrPersoane.realizareRezervare(5, "Ioana Popescu");
        rezervareNrPersoane.realizareRezervare(2, "Andrei Gavrila");
    }
}
