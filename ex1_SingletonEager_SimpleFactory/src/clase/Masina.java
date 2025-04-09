package clase;

public class Masina extends AMasina implements IMasina{

    public Masina(String nrInmatriculare, int anFabricatie, String marca) {
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {

    }
}
