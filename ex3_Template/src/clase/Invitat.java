package clase;

public class Invitat {
    private String nume;
    private int numarPersoane;

    public Invitat(String nume, int numarPersoane) {
        this.nume = nume;
        this.numarPersoane = numarPersoane;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }
}
