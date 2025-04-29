package clase;

public class NumeClientProxy implements IRezervare {
    private IRezervare rezervare;

    public NumeClientProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(int nrPersoane, String nume) {
        if(nume.length() >= 5){
            this.rezervare.realizareRezervare(nrPersoane, nume);
        }else{
            System.out.println("NU este valida rezervarea! " +
                    "Numele clientului este prea mic: " + nume + "! ");
        }
    }
}
