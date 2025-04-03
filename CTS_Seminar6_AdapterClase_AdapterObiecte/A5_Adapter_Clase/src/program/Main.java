package program;

import clase.AdapterMedicament;
import clase.Farmacie;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");

        MedicamentFarmacie medFarmacie1 = new MedicamentFarmacie("Parasinus",
                "04/09/2028", 24.55f, true);
        farmacie.vindeMedicament(medFarmacie1);

        System.out.println("\n----------------");

        MedicamentFarmacie medFarmacie2 = new MedicamentFarmacie("Algocalmin",
                "15/10/2027", 39.95f, true);
        farmacie.vindeMedicament(medFarmacie2);

        MedicamentSpital medSpital1 = new MedicamentSpital("Paracetamol", 14.99f);

        System.out.println("\n-------- Utilizare Adapter Obiecte --------");
        AdapterMedicament adapterMed = new AdapterMedicament("Paracetamol", 14.99f);
        farmacie.vindeMedicament(adapterMed);
    }
}
