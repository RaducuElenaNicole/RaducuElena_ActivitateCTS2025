package program;

import clase.ClaseSpecificeAdapter.AdapterSpital_to_Farmacie;
import clase.ClaseSpecificeAdapter.AplicatieFarmacie;
import clase.ClaseSpecificeAdapter.AplicatieSpital;

public class Main {

    public static void vindeMedicament(AplicatieFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la " + medicamentFarmacie.getNumeFarmacie());
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        System.out.println("\n----------------\n");

        AplicatieFarmacie medFarmacie1 = new AplicatieFarmacie("Salofalk 0.5g",
                124.99f, "09/12/2029", true,
                "Farmacia Academica");
        medFarmacie1.cumparaMedicament();

        System.out.println("\n----------------\n");

        System.out.println("\n-------- Utilizare Adapter Obiecte --------");
        AplicatieSpital medSpital = new AplicatieSpital("Paracetamol", 12.78f,
                "Grigore Alexandrescu, Bucuresti");
        vindeMedicament(new AdapterSpital_to_Farmacie(medSpital));
    }
}
