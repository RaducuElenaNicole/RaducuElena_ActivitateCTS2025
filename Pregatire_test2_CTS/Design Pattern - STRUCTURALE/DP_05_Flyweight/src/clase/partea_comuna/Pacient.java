package clase.partea_comuna;

public class Pacient implements PacientAbstract {
    private String CNP;
    private String numePacient;
    private int varsta;
    // telefon + adresa

    public Pacient(String CNP, String numePacient, int varsta) {
        this.CNP = CNP;
        this.numePacient = numePacient;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("CNP='").append(CNP).append('\'');
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareDetaliiSpitalizare(Spitalizare s) {
        System.out.println("Detaliile pacientului sunt: " + this.toString());
        System.out.println("Detaliile privind spitalizarea sunt: " + s.toString());
    }
}
