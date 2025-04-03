package clase;

// Adapter de OBIECTE

public class AdapterMedicament extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNumeMed(), "25/09/2026",
                medicamentSpital.getPret(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
