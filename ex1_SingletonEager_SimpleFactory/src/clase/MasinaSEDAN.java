package clase;

public class MasinaSEDAN extends AMasina implements IMasina{
    private String culoare;

    public MasinaSEDAN(String nrInmatriculare, int anFabricatie, String marca, String culoare) {
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
        this.marca = marca;
        this.culoare = culoare;
    }

    @Override
    public void descriere() {
        System.out.println("MasinaSEDAN -> Marca: " + marca +
                " | An: " + anFabricatie +
                " | Nr: " + nrInmatriculare +
                " | Culoare: " + culoare);
    }
}
