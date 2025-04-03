package clase;

public class MedicamentFarmacie {
    private String numeMed;
    private String dataExpirare;
    private float pret;
    private boolean esteInStoc;

    public void cumparaMedicament(){
        System.out.println("Medicament { Denumire: "
        + this.numeMed + " | Data expirare: " + this.dataExpirare
        + " | Pret: " + this.pret +  " | Este in stoc: " + this.esteInStoc + " }");
    }

    public MedicamentFarmacie(String numeMed, String dataExpirare, float pret, boolean esteInStoc) {
        this.numeMed = numeMed;
        this.dataExpirare = dataExpirare;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }
}
