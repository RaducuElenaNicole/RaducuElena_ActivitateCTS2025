package clase;

// Adapter de CLASE

public class AdapterMedicament extends MedicamentSpital implements IMedicamentFarmacie {

    public AdapterMedicament(String numeMed, float pret) {
        super(numeMed, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
