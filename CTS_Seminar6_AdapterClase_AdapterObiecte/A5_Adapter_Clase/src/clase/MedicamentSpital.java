package clase;

public class MedicamentSpital {
    private String numeMed;
    private float pret;

    public void prezintaMedicament(){
        System.out.println("Este prezentata RETETA pentru medicamentul " + this.numeMed);
    }

    public void achizitioneazaMedicament(){
        prezintaMedicament();
        System.out.println("Pretul este: " + this.pret);
    }

    public String getNumeMed() {
        return numeMed;
    }

    public float getPret() {
        return pret;
    }

    public MedicamentSpital(String numeMed, float pret) {
        this.numeMed = numeMed;
        this.pret = pret;
    }
}
