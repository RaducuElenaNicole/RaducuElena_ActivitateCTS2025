package clase.ClaseSpecificeAdapter;

// Adapter de OBIECTE
// are o instanta ADAPTEE de tipul clasei existente (AplicatieSpital)

public class AdapterSpital_to_Farmacie extends AplicatieFarmacie {
    AplicatieSpital medicamentSpital = new AplicatieSpital("Nurofen 400mg",
            55.90f, "Spitalul Militar, Pitesti");

    public AdapterSpital_to_Farmacie(AplicatieSpital medicamentSpital) {
        super(medicamentSpital.getDenumire(), medicamentSpital.getPret(), "03/09/2028",
                true, "Catena");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
