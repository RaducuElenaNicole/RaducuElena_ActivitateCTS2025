package clase;

public class Rezervare implements IRezervare {

    public Rezervare() {

    }

    @Override
    public void realizareRezervare(int nrPersoane, String nume) {
        System.out.println("Rezervarea realizata are urmatoarele detalii " +
                "-> Numar Persoane: " + nrPersoane + " | Numele clientului: "
                + nume);
    }
}
