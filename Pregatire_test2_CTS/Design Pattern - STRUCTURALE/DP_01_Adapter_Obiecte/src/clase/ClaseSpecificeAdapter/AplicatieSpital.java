package clase.ClaseSpecificeAdapter;

import clase.Medicament;

public class AplicatieSpital extends Medicament {
    private String numeSpital;

    public AplicatieSpital(String denumire, float pret, String numeSpital) {
        super(denumire, pret);
        this.numeSpital = numeSpital;
    }

    public void prezentareDetalii(){
        System.out.println("Medicamentul cu detaliile -> denumire: " + this.getDenumire()
        + " - pret: " + this.getPret() + " este la spitalul " + this.numeSpital);

        // System.out.println(this.toString() + " - Spital: " + this.numeSpital);
    }

    public void achizitioneazaMedicament(){
        prezentareDetalii();
        System.out.println("Medicamentul se poate achizitiona doar pe baza retetei!");
    }
}
