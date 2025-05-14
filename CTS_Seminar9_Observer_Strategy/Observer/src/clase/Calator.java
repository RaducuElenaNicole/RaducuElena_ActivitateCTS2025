package clase;

public class Calator implements Observer {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Calatorul cu numele " + this.nume + " a primit urmatorul " +
                "mesaj:\n    { " + mesaj + " } ");
    }
}
