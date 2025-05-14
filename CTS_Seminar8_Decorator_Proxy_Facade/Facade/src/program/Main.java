package program;

import clase.Facade;
import clase.Masa;

public class Main {
    public static void main(String[] args) {
        System.out.println("masa -> ");
        Masa masa = new Masa(4, true, "Andreea Calin");
        System.out.println(masa.toString());

        System.out.println();

        System.out.println("telefon -> ");
        Facade telefon = new Facade();
        System.out.println(telefon.verificareAsezareMasa(masa));

        System.out.println();

        System.out.println("masaNoua1 -> ");
        Masa masaNoua1 = new Masa(7, true, "Marius Popescu");
        System.out.println(masaNoua1.toString() + " --- ");
        System.out.println(telefon.verificareAsezareMasa(masaNoua1));

        System.out.println();

        System.out.println("masaNoua2 -> ");
        Masa masaNoua2 = new Masa(8, false, "Ioana Avram");
        System.out.println(masaNoua2.toString() + " --- ");
        System.out.println(telefon.verificareAsezareMasa(masaNoua2));

        System.out.println();

        System.out.println("masaNoua3 -> ");
        Masa masaNoua3 = new Masa(3, true, "Adrian Marinescu");
        System.out.println(masaNoua3.toString() + " --- ");
        System.out.println(telefon.verificareAsezareMasa(masaNoua3));

        System.out.println();

        System.out.println("masaNoua4 -> ");
        Masa masaNoua4 = new Masa(6, true, "Stefania Savu");
        System.out.println(masaNoua4.toString() + " --- ");
        System.out.println(telefon.verificareAsezareMasa(masaNoua4));
    }
}
