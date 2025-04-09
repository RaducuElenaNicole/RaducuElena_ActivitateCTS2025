package clase;

public class MasinaSUV extends AMasina implements IMasina{
    private String nrUsi;

    public MasinaSUV(String nrInmatriculare, int anFabricatie, String marca, String nrUsi) {
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
        this.marca = marca;
        this.nrUsi = nrUsi;
    }

    @Override
    public void descriere() {
        System.out.println("MasinaSUV -> Marca: " + marca +
                " | An: " + anFabricatie +
                " | Nr: " + nrInmatriculare +
                " | Nr Usi: " + nrUsi);
    }
}
