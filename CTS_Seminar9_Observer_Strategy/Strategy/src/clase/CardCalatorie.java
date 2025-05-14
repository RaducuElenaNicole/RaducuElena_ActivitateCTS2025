package clase;

public class CardCalatorie implements IMetodaPlata {
    private int numarCalatorii;

    public CardCalatorie(int numarCalatorii) {
        this.numarCalatorii = numarCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.numarCalatorii > 0){
            this.numarCalatorii--;
            System.out.println("Plata cu cardul de calatorii validata! " +
                    "Numarul calatoriilor ramase este: " + this.numarCalatorii);
        }else{
            System.out.println("Eroare! Plata cu cardul de calatorii respinsa! " +
                    "Nu mai sunt calatorii pe card!");
        }
    }
}
