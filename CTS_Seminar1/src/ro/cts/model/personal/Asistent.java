package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;

    public Asistent(String nume, int varsta, int idAsistent, float salariu) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public float calculareVenit() {
        return salariu;
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder();
        builder.append("Asistentul ").append(this.nume).append(" preda de obicei la seminar, dar mai preda si la curs!");
        System.out.println(builder.toString());
    }
}
