package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {
    private int idAngajat;
    private float salariu;
    private float sporVechime;

    public Profesor(String nume, int varsta, int idAngajat, float salariu, float sporVechime) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public float getSporVechime() {
        return sporVechime;
    }

    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ").append(this.nume).append(" preda la curs!");
        System.out.println(builder.toString());
    }

    @Override
    public float calculareVenit() {
        return salariu;
    }
}
