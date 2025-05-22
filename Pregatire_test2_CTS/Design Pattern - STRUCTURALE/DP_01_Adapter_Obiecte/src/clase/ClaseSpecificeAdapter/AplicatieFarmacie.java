package clase.ClaseSpecificeAdapter;

import clase.Medicament;

public class AplicatieFarmacie extends Medicament {
    private String dataExpirare;
    private boolean esteInStoc;
    private String numeFarmacie;

    public AplicatieFarmacie(String denumire, float pret,
                             String dataExpirare, boolean esteInStoc, String numeFarmacie) {
        super(denumire, pret);
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.numeFarmacie = numeFarmacie;
    }

    public void cumparaMedicament(){
        if(this.esteInStoc == true) {
            System.out.println(this.toString() + " - data expirare: " + this.dataExpirare
                    + " -> Medicamentul este in stoc la farmacia: " + this.numeFarmacie);
        }else{
            System.out.println(this.toString() + " - data expirare: " + this.dataExpirare
                    + " -> Medicamentul NU este in stoc la farmacia: " + this.numeFarmacie);
        }
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public boolean isEsteInStoc() {
        return esteInStoc;
    }

    public void setEsteInStoc(boolean esteInStoc) {
        this.esteInStoc = esteInStoc;
    }

    public String getNumeFarmacie() {
        return numeFarmacie;
    }

    public void setNumeFarmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }
}
