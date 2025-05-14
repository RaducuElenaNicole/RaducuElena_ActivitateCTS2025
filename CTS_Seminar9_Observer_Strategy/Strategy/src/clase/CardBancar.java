package clase;

public class CardBancar implements IMetodaPlata {
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.sold >= pretBilet){
            this.sold -= pretBilet;
            System.out.println("S-au extras " + pretBilet + " RON. " +
                    "Plata cu cardul bancar a fost efectuata cu succes! " +
                    "Calatorie placuta! Sold ramas: " + this.sold + " RON.");
        }
    }
}
