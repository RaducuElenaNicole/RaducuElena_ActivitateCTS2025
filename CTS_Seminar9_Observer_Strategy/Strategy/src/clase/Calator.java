package clase;

public class Calator {
    private String nume;
    private int soldCalator;
    private IMetodaPlata metodaPlata;

    public Calator(String nume, int soldCalator) {
        this.nume = nume;
        this.metodaPlata = new CardBancar(soldCalator);
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteCalatorie(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }
}
