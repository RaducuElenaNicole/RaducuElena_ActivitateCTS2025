package clase.partea_comuna;

public class Spitalizare {
    private int nrSalon;
    private int nrPat;
    private int nrZileInternare;

    public Spitalizare(int nrSalon, int nrPat, int nrZileInternare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileInternare = nrZileInternare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZileInternare=").append(nrZileInternare);
        sb.append('}');
        return sb.toString();
    }
}
