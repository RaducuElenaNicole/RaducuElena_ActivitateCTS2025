package A8.program;

import A8.clase.Departament;
import A8.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        Departament dep1 = new Departament("Pediatrie");
        Departament dep1_1 = new Departament("Neonatologie");
        Departament dep1_2 = new Departament("Oncologie pediatrica");

        Departament dep2 = new Departament("Chirurgie");
        Departament dep2_1 = new Departament("CH. Cardiovasculara");
        Departament dep2_2 = new Departament("CH. Pedriatrica");
        Sectie sec1_2_1 = new Sectie("CH. Interna");
        Sectie sec1_2_2 = new Sectie("CH. Toracica");
        Sectie sec1_2_3 = new Sectie("CH. Ortopedica");
        Departament dep2_3 = new Departament("CH. Stomatologica");
        Departament dep2_4 = new Departament("CH. Plastica");

        try{
            System.out.println("\n--------------------------------------------");
            dep1.adaugaSubdepartament(dep1_1);
            dep1.adaugaSubdepartament(dep1_2);
            dep1.descriereStructuraSpital();

            System.out.println("\n--------------------------------------------");
            dep2.adaugaSubdepartament(dep2_1);
            dep2.adaugaSubdepartament(dep2_2);
            dep2_2.adaugaSubdepartament(sec1_2_1);
            dep2_2.adaugaSubdepartament(sec1_2_2);
            dep2_2.adaugaSubdepartament(sec1_2_3);
            dep2.adaugaSubdepartament(dep2_3);
            dep2.adaugaSubdepartament(dep2_4);
            dep2.descriereStructuraSpital();

            // DE VERIFICAT stergerea unui subdepartament!

        }catch (Exception e){
            throw new RuntimeException();
        }


    }
}
