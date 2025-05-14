package program;

import clase.Departament;
import clase.Sectie;

public class Main {
    public static void main(String[] args) {
        Departament dep1 = new Departament("Chirurgie");
        Departament dep2 = new Departament("Oftalmologie");
        Departament dep3 = new Departament("Pediatrie");
        Departament dep4 = new Departament("Cardiologie");

        Sectie sectie1 = new Sectie("Sectia 1");
        Sectie sectie2 = new Sectie("Sectia 2");

        try{
            dep1.adaugaNod(dep2);
            dep1.adaugaNod(dep4);
            dep1.adaugaNod(dep3);

            dep1.adaugaNod(sectie1);
            dep2.adaugaNod(sectie2);

            dep1.descriereStructura();

            System.out.println("\n-------------------\n");

            dep2.descriereStructura();

            System.out.println("\n-------------------\n");

            dep1.stergeNod(dep2);
            dep1.descriereStructura();

        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
