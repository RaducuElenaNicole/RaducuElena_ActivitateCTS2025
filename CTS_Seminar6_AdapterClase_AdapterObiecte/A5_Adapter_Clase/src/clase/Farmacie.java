package clase;

public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medFarmacie){
        System.out.println("Bine ati venit la farmaciea " + this.numeFarmacie + "! ");
        medFarmacie.cumparaMedicament();
    }
}
