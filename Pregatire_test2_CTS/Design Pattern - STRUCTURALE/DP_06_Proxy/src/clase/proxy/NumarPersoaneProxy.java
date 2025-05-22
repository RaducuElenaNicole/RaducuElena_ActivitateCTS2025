package clase.proxy;

import clase.IRezervare;
import clase.Rezervare;

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
            System.out.println("Rezervarea nu este confirmata! " +
                    "Numarul de persoane este prea mic " + nrPersoane);
        }
    }
}
