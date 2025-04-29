package clase;

public class NumarPersoaneProxy implements IRezervare {
    private IRezervare rezervare;

    public NumarPersoaneProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(int nrPersoane, String nume) {
        if(nrPersoane >= 4){
            rezervare.realizareRezervare(nrPersoane, nume);
        }else{
            System.out.println("NU este valida rezervarea! " +
                    "Numarul persoanelor este prea mic: " + nrPersoane + "! ");
        }
    }
}
