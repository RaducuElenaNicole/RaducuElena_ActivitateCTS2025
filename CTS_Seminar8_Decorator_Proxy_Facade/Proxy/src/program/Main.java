package program;

import clase.IRezervare;
import clase.NumarPersoaneProxy;
import clase.NumeClientProxy;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare rezervareNrPersoaneProxy = new NumarPersoaneProxy(rezervare);

        System.out.print("1 -> ");
        rezervareNrPersoaneProxy.realizareRezervare(2, "Bogdan");
        System.out.print("2 -> ");
        rezervareNrPersoaneProxy.realizareRezervare(10, "Alexia");

        System.out.println("\n--------------------");

        IRezervare proxyCompus = new NumeClientProxy(rezervareNrPersoaneProxy);
        System.out.print("3 -> ");
        proxyCompus.realizareRezervare(2, "Ana-Maria");
        System.out.print("4 -> ");
        proxyCompus.realizareRezervare(10, "Ema");
        System.out.print("5 -> ");
        proxyCompus.realizareRezervare(6, "Andrei");
        System.out.print("6 -> ");
        proxyCompus.realizareRezervare(1, "Ana");
    }
}
