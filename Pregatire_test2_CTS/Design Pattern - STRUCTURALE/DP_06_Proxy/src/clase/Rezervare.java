package clase;

public class Rezervare implements IRezervare{

    public Rezervare() {
    }

    @Override
    public void realizareRezervare(int nrPersoane, String nume) {
        System.out.println("Rezervarea confirmata are detaliile: Numar persoane = "
                + nrPersoane + " - Nume = " + nume);
    }
}
