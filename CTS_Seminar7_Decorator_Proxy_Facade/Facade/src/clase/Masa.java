package clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;
    private String numeClient;

    public Masa(int nrMasa, boolean esteLibera, String numeClient) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa { ");
        sb.append("nrMasa = ").append(nrMasa);
        sb.append(" | esteLibera = ").append(esteLibera);
        sb.append(" | numeClient = ").append(numeClient);
        sb.append(" }");
        return sb.toString();
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public String getNumeClient() {
        return numeClient;
    }
}
